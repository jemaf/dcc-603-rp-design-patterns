package strategy;

public class SpecialCharStrategy implements PasswordStrategy {
    @Override
    public boolean validate(String password) {
        return password != null && password.matches(".*[^a-zA-Z0-9].*");
    }
}
