package decorator;

public class Ketchup extends IngredienteDecorator {

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Ketchup() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        return "Ketchup" + (ingrediente != null ? ", " + ingrediente.imprimeIngrediente() : "");
    }

    @Override
    public double valorDoIngrediente() {
        return 1.00 + (ingrediente != null ? ingrediente.valorDoIngrediente() : 0);
    }
}
