package strategy;

public class UpperCaseStrategy extends PasswordStrategy{
    @Override
    public boolean validate(String password) {
        char character;
        for (int i=0; i< password.length(); i++){
            character = password.charAt(i);
            if (Character.isUpperCase(character)){
                return true;
            }
        }
        return false;
    }
}
