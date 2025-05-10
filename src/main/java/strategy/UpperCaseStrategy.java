package strategy;

public class UpperCaseStrategy extends PasswordStrategy{
    
    public boolean validate (String password) {

        String hasUpperCaseLetterRegex = ".*[A-Z].*";
        return password.matches(hasUpperCaseLetterRegex);
    }
}
