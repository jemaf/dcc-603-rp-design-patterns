package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;

    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String password) {
        if (this.strategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de validação definida.");
        }
        return this.strategy.validate(password);
    }
}
