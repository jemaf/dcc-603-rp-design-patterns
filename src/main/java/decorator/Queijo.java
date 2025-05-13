package decorator;

public class Queijo extends IngredienteDecorator {
    private static final double PRECO = 0.75;

    public Queijo() {
        super(null);
    }

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return ingrediente != null ?
                "Queijo, " + ingrediente.imprimeIngrediente() : "Queijo";
    }

    @Override
    public double valorDoIngrediente() {
        return (ingrediente != null ? ingrediente.valorDoIngrediente() : 0) + PRECO;
    }
}