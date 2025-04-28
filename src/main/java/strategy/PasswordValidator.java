package strategy;

public class PasswordValidator {

    // FIXME só aceita um tipo de validação (por tamanho)
    public boolean validate(String password) {
        return password.length() >= 8;
    }

}
