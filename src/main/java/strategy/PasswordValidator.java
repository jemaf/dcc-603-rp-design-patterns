package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;

    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String password) {
        return this.strategy.validate(password);
    }
}