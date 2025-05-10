package strategy;

public class SpecialCharStrategy extends PasswordStrategy {
    private final String specialChars = "!@#$%^&*()_-+={}[]\\|:;\"'<>,.?/~`";
    
    @Override
    public boolean validate(String password) {
        if (password == null) {
            return false;
        }
        
        for (char c : password.toCharArray()) {
            if (specialChars.indexOf(c) != -1) {
                return true;
            }
        }
        
        return false;
    }
}