package strategy;

public class SpecialCharStrategy extends PasswordStrategy {
    @Override
    public boolean validate(String password) {
        // Senhas devem ter pelo menos um caractere especial
        if (password == null) {
            return false;
        }
        // Basicamente, verifica se há algo que não seja letra ou dígito
        // Pode ser expandido para uma lista específica de caracteres especiais
        String specialChars = "!@#$%^&*()-+="; // Exemplo de caracteres especiais
        for (char c : password.toCharArray()) {
            if (specialChars.contains(String.valueOf(c))) {
                return true;
            }
        }
        // Alternativamente, usando regex:
        // return password.matches(".*[^a-zA-Z0-9].*");
        return false;
    }
} 