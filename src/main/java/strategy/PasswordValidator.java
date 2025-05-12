package strategy;

public class PasswordValidator {

    private PasswordStrategy strategy;

    public PasswordValidator() {
        // Pode definir uma estratégia padrão ou deixar nulo até setStrategy ser chamado
        this.strategy = null;
    }

    // Método para definir a estratégia atual
    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    // Método para validar a senha usando a estratégia atual
    public boolean validate(String password) {
        if (this.strategy == null) {
            // Lança uma exceção ou retorna false se nenhuma estratégia foi definida
            System.err.println("Erro: Nenhuma estratégia de validação foi definida.");
            return false;
        }
        return this.strategy.validate(password);
    }
}
