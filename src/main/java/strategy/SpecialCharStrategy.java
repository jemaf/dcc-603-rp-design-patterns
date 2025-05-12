package strategy;

public class SpecialCharStrategy extends PasswordStrategy {

	@Override
	public boolean validate(String password) {
		for(int i = 0; i < password.length(); i++) {
			if(!Character.isLetterOrDigit(password.charAt(i)) && !Character.isWhitespace(i)) {
				return true;
			}
		}
		return false;
	}
}
