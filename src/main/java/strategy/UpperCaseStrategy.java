package strategy;

public class UpperCaseStrategy extends PasswordStrategy{
    @Override
    public boolean validate(String password){
        if (password == null || password.isEmpty()) {
            return false;
        }
        return password.chars().anyMatch(Character :: isUpperCase);
    }
}
