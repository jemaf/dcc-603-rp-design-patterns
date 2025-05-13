package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        validator.setStrategy(new LengthStrategy());
        System.out.println("Tamanho válido: " + validator.validate("12345678"));

        validator.setStrategy(new UpperCaseStrategy());
        System.out.println("Tem maiúscula: " + validator.validate("senhaSegura"));

        validator.setStrategy(new SpecialCharStrategy());
        System.out.println("Tem caractere especial: " + validator.validate("senha123!"));
    }
}