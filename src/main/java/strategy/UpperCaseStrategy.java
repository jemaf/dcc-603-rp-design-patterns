package strategy;

public class UpperCaseStrategy implements PasswordStrategy {
    @Override
    public boolean validate(String password) {
        return password != null && password.matches(".*[A-Z].*");
    }
}
