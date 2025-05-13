package strategy;

public class SpecialCharStrategy extends PasswordStrategy {
    @Override
    public boolean validate(String password) {
        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
                break;
            }
        }

        return hasSpecialChar;
    }
}