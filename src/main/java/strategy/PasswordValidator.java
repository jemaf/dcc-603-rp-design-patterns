package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;
    // FIXME só aceita um tipo de validação (por tamanho)
    
    public PasswordValidator() {
        this.strategy = new LengthStrategy();
    }

    public boolean validate(String password) {
        if (password == null) {
            return false;
        }
        return this.strategy.validate(password);
    }

    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

}
