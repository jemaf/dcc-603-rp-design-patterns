package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;

    // Permite trocar a estratégia de validação
    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String password) {
        if (strategy == null) {
            throw new IllegalStateException("Estratégia de validação não definida.");
        }
        return strategy.validate(password);
    }
}

