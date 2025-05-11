package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;

    // Método para definir a estratégia de validação
    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    // Método para validar a senha usando a estratégia definida
    public boolean validate(String password) {
        if (strategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de validação foi definida.");
        }
        return strategy.validate(password);
    }
}