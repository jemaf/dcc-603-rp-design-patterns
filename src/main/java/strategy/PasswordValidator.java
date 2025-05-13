package strategy;

public class PasswordValidator {
    private PasswordStrategy strategy;

    // FIXME só aceita um tipo de validação (por tamanho)
    public boolean validate(String password) {
        return this.strategy.validate(password);
    }

    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

}
