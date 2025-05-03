package strategy;

public class UpperCaseStrategy extends PasswordStrategy {

    public boolean validate(String password){
        return password.matches(".*[A-Z].*");
    }
}
