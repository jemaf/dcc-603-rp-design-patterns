package strategy;

public class LengthStrategy extends PasswordStrategy {
    public boolean validate(String password) {
        if (password.length() >= 8) {
            return true;
        }
        return false;

    }
}