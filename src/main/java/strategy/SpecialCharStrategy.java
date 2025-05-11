package strategy;

public class SpecialCharStrategy extends PasswordStrategy {

    private static final String CARACTERES_ESPECIAIS = "!@#$%^&*()_+-=[]{}|;:'\",.<>/?";

    @Override
    public boolean validate(String password) {
        for (char c : password.toCharArray()) {
            if (CARACTERES_ESPECIAIS.indexOf(c) >= 0) {
                return true;
            }
        }
        return false;
    }
}