package strategy;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidator {
    private List<PasswordStrategy> strategies = new ArrayList<>();

    public void addStrategy(PasswordStrategy strategy) {
        strategies.add(strategy);
    }

    public void setStrategy(PasswordStrategy strategy) {
        strategies.clear();              
        strategies.add(strategy);        
    }

    public boolean validate(String password) {
        for (PasswordStrategy strategy : strategies) {
            if (!strategy.validate(password)) {
                return false;
            }
        }
        return true;
    }
}
