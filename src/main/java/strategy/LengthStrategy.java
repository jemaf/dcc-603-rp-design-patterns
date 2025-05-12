package strategy;

public class LengthStrategy {
    public boolean validate(String password) {
        return password.length() >= 8;
    }
}
