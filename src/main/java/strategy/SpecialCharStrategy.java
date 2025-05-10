package strategy;

public class SpecialCharStrategy extends PasswordStrategy {
    public boolean validate(String password) {

        for (int i = 0; i < password.length(); i++) {
            if ((password.charAt(i) >= 33 && password.charAt(i) <= 47)
                    || (password.charAt(i) >= 58 && password.charAt(i) <= 64)
                    || (password.charAt(i) >= 91 && password.charAt(i) <= 96)
                    || (password.charAt(i) >= 123 && password.charAt(i) <= 126))
                return true;

        }
        return false;

    }

}