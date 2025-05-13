package strategy;

public class LengthStrategy extends PasswordStrategy {
    private static final int MIN_LENGTH = 8;

    @Override
    public boolean validate(String password) {
        return password.length() >= MIN_LENGTH;
    }
}