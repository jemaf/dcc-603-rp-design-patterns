package strategy;

public class PasswordValidator {

    private List<PasswordStrategy> strategies;
    
    public PasswordValidator() {
        this.strategies = new ArrayList<>();
        setStrategy(new LengthStrategy());
    }
    
    public void setStrategy(PasswordStrategy strategy) {
        this.strategies.clear();
        this.strategies.add(strategy);
    }
    
    public void addStrategy(PasswordStrategy strategy) {
        this.strategies.add(strategy);
    }
    
    public void clearStrategies() {
        this.strategies.clear();
    }
    
    public boolean validate(String password) {
        if (strategies.isEmpty()) {
            return true;
        }
        
        for (PasswordStrategy strategy : strategies) {
            if (!strategy.validate(password)) {
                return false;
            }
        }
        
        return true;
    }
}
