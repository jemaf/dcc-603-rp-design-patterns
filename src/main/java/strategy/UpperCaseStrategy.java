package strategy;

public class UpperCaseStrategy extends PasswordStrategy {
    public boolean validate(String password) {

        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 65 && password.charAt(i) <= 90)
                return true;

        }
        return false;

    }

}

