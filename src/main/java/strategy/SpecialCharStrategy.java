package strategy;

public class SpecialCharStrategy extends PasswordStrategy {
    public boolean validate(String password){
        return password.matches(".*[^a-zA-Z0-9].*"); //regex para conferir caracteres especiais
    }
}