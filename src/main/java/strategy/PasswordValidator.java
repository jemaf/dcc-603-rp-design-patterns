package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;

    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String password) {
        if (this.strategy == null) {
            throw new IllegalStateException("Validation strategy not set.");
        }
        return this.strategy.validate(password);
    }
}
