package strategy;

public class UpperCaseStrategy extends PasswordStrategy {

    @Override
    public boolean validate(String password) {
        for (char caractere : password.toCharArray()) {
            if (Character.isUpperCase(caractere)) {
                return true;
            }
        }
        return false;
    }
}