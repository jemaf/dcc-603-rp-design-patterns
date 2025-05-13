package strategy;

public class LengthStrategy extends PasswordStrategy {

    private static final int tamMinimo = 8;

    @Override
    public boolean validate(String password) {
        return password != null && password.length() >= tamMinimo;
    }
}