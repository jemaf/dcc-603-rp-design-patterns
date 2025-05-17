package strategy;

public class SpecialCharStrategy extends PasswordStrategy {

    @Override
    public boolean validate(String password) {
        String specialChars = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/\\";
        for (char c : password.toCharArray()) {
            if (specialChars.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
}