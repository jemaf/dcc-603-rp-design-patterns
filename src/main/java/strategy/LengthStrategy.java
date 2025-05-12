package strategy;

public class LengthStrategy extends PasswordStrategy {

    private static final int MIN_SIZE = 8;

    @Override
    public boolean validate(String password) {
        return password != null && password.length() >= MIN_SIZE;
    }
}