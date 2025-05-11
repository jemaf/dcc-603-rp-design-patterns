package strategy;

public class LengthStrategy extends PasswordStrategy {

    private static final int TAMANHO_MINIMO = 8;

    @Override
    public boolean validate(String password) {
        return password != null && password.length() >= TAMANHO_MINIMO;
    }
}