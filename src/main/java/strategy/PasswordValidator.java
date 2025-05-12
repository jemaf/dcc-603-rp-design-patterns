package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;

    // Construtor com uma estratégia padrão
    public PasswordValidator() {
        this.strategy = new LengthStrategy();
    }

    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String password) {
        return strategy.validate(password);
    }

}
