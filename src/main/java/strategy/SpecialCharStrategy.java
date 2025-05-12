package strategy;

import java.util.regex.Pattern;

public class SpecialCharStrategy extends PasswordStrategy {

    private static final Pattern SPECIAL_CHAR_PATTERN = Pattern.compile("[!@#$%^&*()_+\\-=[\\]{}|;:'\",.<>/?]");

    @Override
    public boolean validate(String password) {
        return SPECIAL_CHAR_PATTERN.matcher(password).find();
    }
}
