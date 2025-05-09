package strategy;

public abstract class PasswordStrategy {

    // Estratégia para validar o tamanho mínimo da senha (8 caracteres)
    public class LengthStrategy extends PasswordStrategy {

        @Override
        public boolean validate(String password) {
            return password.length() >= 8;
        }
    }

    // Estratégia para validar a presença de uma letra maiúscula
    public class UpperCaseStrategy extends PasswordStrategy {

        @Override
        public boolean validate(String password) {
            return password.chars().anyMatch(Character::isUpperCase);
        }
    }

    // Estratégia para validar a presença de um caractere especial
    public class SpecialCharStrategy extends PasswordStrategy {

        @Override
        public boolean validate(String password) {
            return password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");

        }
    }

    public abstract boolean validate(String password);
}
