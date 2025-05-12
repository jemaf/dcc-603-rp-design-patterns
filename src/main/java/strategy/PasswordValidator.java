package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;

    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String password) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        return strategy.validate(password);
    }
}
