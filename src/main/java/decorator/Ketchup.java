package decorator;

public class Ketchup extends IngredienteDecorator {
    private static final double PRECO = 1.00;

    public Ketchup() {
        super(null);
    }

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return ingrediente != null ?
                "Ketchup, " + ingrediente.imprimeIngrediente() : "Ketchup";
    }

    @Override
    public double valorDoIngrediente() {
        return (ingrediente != null ? ingrediente.valorDoIngrediente() : 0) + PRECO;
    }
}