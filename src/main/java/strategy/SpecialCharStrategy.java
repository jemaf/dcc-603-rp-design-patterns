package strategy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SpecialCharStrategy extends PasswordStrategy{
    @Override
    public boolean validate(String password) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcher = pattern.matcher(password);

        return !matcher.matches();
    }
}
