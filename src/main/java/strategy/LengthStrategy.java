package strategy;

public class LengthStrategy extends PasswordStrategy {

    public boolean validate(String password){
        return password.length() >= 8;
    }
}
