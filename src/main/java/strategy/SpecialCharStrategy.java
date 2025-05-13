package strategy;

public class SpecialCharStrategy extends PasswordStrategy {

    private static final String caracteresEspeciais = "!@#$%^&*()_+-=[]{}|;:'\",.<>/?";

    @Override
    public boolean validate(String password) {
        for (char c : password.toCharArray()) {
            if (caracteresEspeciais.indexOf(c) >= 0) {
                return true;
            }
        }
        return false;
    }
}