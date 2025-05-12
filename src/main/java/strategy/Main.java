package strategy;

public class Main {
    public static void main(String[] args) {
        PasswordValidator validator = new PasswordValidator();

        validator.setStrategy(new LengthStrategy());
        System.out.println(validator.validate("12345678")); // true

        validator.setStrategy(new UpperCaseStrategy());
        System.out.println(validator.validate("abcdEfg")); // true

        validator.setStrategy(new SpecialCharStrategy());
        System.out.println(validator.validate("abc$123")); // true
    }
}
