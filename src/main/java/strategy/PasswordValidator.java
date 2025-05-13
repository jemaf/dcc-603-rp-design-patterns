package strategy;

public class PasswordValidator {
    // Referência: https://www.freecodecamp.org/news/a-beginners-guide-to-the-strategy-design-pattern/
    private PasswordStrategy strategy;
    
    public PasswordValidator(PasswordStrategy passwordStrategy){
        this.strategy = passwordStrategy;
    }

    public boolean validate(String password) {
        return strategy.validate(password);
    }

}
