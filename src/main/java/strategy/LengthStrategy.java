package strategy;

public class LengthStrategy extends PasswordStrategy {
    private final int minLength;
    
    public LengthStrategy() {
        this.minLength = 8;
    }
    
    @Override
    public boolean validate(String password) {
        return password != null && password.length() >= minLength;
    }
}