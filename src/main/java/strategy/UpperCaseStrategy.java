package strategy;

public class UpperCaseStrategy extends PasswordStrategy {

    @Override
    public boolean validate(String password) {
        return password.chars().anyMatch(Character::isUpperCase);
    }

}