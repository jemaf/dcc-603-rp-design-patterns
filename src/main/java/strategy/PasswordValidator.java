package strategy;

public class PasswordValidator {

    public boolean validate(String password) {
        return password.length() >= 8;
    }

}
