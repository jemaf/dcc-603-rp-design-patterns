package strategy;

public class PasswordValidator {
    private PasswordStrategy passwordStrategy;

    public void setStrategy(PasswordStrategy passwordStrategy) {
        this.passwordStrategy = passwordStrategy;
    }

    public boolean validate(String password) {
        return this.passwordStrategy.validate(password);
    }
}
