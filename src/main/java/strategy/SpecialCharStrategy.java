package strategy;

import java.util.regex.Pattern;

public class SpecialCharStrategy extends PasswordStrategy {
    @Override
    public boolean validate(String password) {
        Pattern specialCharPattern = Pattern.compile("[^a-zA-Z0-9]");
        return specialCharPattern.matcher(password).find();
    }
}