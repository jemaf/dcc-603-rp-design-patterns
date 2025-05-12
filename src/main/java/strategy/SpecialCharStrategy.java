package strategy;

public class SpecialCharStrategy extends PasswordStrategy {

    @Override
    public boolean validate(String password) {
        return password.chars().anyMatch(ch -> "!@#$%^&*()_+[]{}|;:',.<>?/".indexOf(ch) >= 0);
    }
}