package strategy;

public class SpecialCharStrategy extends PasswordStrategy{
    
    public boolean validate (String password) {

        String hasSpecialCharRegex = ".*[^a-zA-Z0-9].*";
        return password.matches(hasSpecialCharRegex);
    }
}
