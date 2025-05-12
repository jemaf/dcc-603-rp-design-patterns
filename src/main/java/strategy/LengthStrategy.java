package strategy;

public class LengthStrategy extends PasswordStrategy {
    @Override
    public boolean validate(String password){
        if (password == null || password.isEmpty()) {
            return false;
        }
        return password.length() >= 8;
    }
}
