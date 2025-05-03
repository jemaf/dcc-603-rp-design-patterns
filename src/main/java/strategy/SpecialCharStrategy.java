package strategy;

public class SpecialCharStrategy extends PasswordStrategy {

    public boolean validate(String password){
        return password.matches(".*[!@#$%^&*()_+-={}|:;\"'<>,.?/~`].*");
    }
}
