package decorator;

public class Ketchup extends IngredienteDecorator {
    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    // Construtor sem parâmetros para o teste
    public Ketchup() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        if (ingrediente == null) {
            return "Ketchup";
        }
        return "Ketchup, " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        if (ingrediente == null) {
            return 1.0;
        }
        return 1.0 + ingrediente.valorDoIngrediente();
    }
}