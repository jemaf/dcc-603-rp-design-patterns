package strategy;

public abstract class PasswordStrategy {

    // Estratégia para validar o tamanho mínimo da senha (8 caracteres)
    public class LengthStrategy extends PasswordStrategy {

        @Override
        public boolean validate(String password) {
            return password.length() >= 8;
        }
    }


    public abstract boolean validate(String password);
}
