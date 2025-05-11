package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        // Testar com LengthStrategy
        validator.setStrategy(new LengthStrategy());
        System.out.println("Validação por tamanho: " + validator.validate("123123456")); // true
        System.out.println("Validação por tamanho: " + validator.validate("1212")); // false

        // Testar com UpperCaseStrategy
        validator.setStrategy(new UpperCaseStrategy());
        System.out.println("Validação por letra maiúscula: " + validator.validate("abcDEF")); // true
        System.out.println("Validação por letra maiúscula: " + validator.validate("abcdef")); // false

        // Testar com SpecialCharStrategy
        validator.setStrategy(new SpecialCharStrategy());
        System.out.println("Validação por caractere especial: " + validator.validate("abc@123")); // true
        System.out.println("Validação por caractere especial: " + validator.validate("abcdef")); // false
    }
}