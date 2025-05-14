package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        validator.setStrategy(new LengthStrategy());
        System.out.println("Length >= 8: " + validator.validate("12345678")); // true
        System.out.println("Length >= 8: " + validator.validate("123"));      // false

        validator.setStrategy(new UpperCaseStrategy());
        System.out.println("Has uppercase: " + validator.validate("abcD123")); // true
        System.out.println("Has uppercase: " + validator.validate("abcd123")); // false

        validator.setStrategy(new SpecialCharStrategy());
        System.out.println("Has special char: " + validator.validate("abc@123")); // true
        System.out.println("Has special char: " + validator.validate("abc123"));  // false
    }
}

