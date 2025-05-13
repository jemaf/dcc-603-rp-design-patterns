package strategy;

public class LengthStrategy implements PasswordStrategy {
    @Override
    public boolean validate(String password) {
        return password != null && password.length() >= 8;
    }
}
