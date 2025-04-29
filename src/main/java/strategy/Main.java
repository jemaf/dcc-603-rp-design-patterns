package strategy;
public class Main {
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();

        validator.setStrategy(new LengthStrategy());
        boolean isValid = validator.validate("Senha123");
        validator.setStrategy(new UpperCaseStrategy());
        boolean isValid2 = validator.validate("Senha123");
        validator.setStrategy(new SpecialCharStrategy());
        boolean isValid3 = validator.validate("Senha@123");

        System.out.println(isValid);
        System.out.println(isValid2);
        System.out.println(isValid3);
    }
}