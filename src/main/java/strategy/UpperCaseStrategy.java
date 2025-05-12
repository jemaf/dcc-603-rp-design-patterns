package strategy;

public class UpperCaseStrategy extends PasswordStrategy {

    @Override
    public boolean validate(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}