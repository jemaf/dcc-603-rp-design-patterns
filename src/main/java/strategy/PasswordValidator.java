package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;
	// FIXME só aceita um tipo de validação (por tamanho)
	public void setStrategy(PasswordStrategy s) {
		strategy = s;
	}
	
    public boolean validate(String password) {
        return strategy.validate(password);
    }

}
