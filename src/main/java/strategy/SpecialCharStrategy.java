package strategy;

public class SpecialCharStrategy extends PasswordStrategy {
    @Override
    public boolean validate(String password) {
        if (password == null) return false;
        return password.matches(".*[^a-zA-Z0-9].*");
    }
}
