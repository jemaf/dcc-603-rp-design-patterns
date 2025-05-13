package strategy;

public class LengthStrategy extends PasswordStrategy {
    @Override
    public boolean validate(String password) {
        // Senhas devem ter pelo menos 8 caracteres de tamanho
        return password != null && password.length() >= 8;
    }
} 