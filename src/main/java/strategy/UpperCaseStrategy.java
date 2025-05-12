package strategy;

public class UpperCaseStrategy extends PasswordStrategy {

    @Override
    public boolean validate(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
