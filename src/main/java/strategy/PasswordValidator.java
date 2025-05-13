package strategy;

public class PasswordValidator {
    private PasswordStrategy strategy;

    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    // FIXME só aceita um tipo de validação (por tamanho)
    // Done!
    public boolean validate(String password) {
        return this.strategy.validate(password);
    }
}