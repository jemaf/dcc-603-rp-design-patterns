package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        validator.setStrategy(new LengthStrategy());
        System.out.println(validator.validate("123123456"));
        System.out.println(validator.validate("1212"));

        validator.setStrategy(new SpecialCharStrategy());
        System.out.println(validator.validate("senhaCom!&"));
        System.out.println(validator.validate("senhasem"));

        validator.setStrategy(new UpperCaseStrategy());
        System.out.println(validator.validate("senhaCom"));
        System.out.println(validator.validate("senhasem"));
    }
}
