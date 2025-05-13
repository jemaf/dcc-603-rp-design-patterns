package decorator;

public class Bacon extends IngredienteDecorator {
    private static final double PRECO = 1.50;
    public Bacon() {
        super(null);
    }

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return ingrediente != null ?
                "Bacon, " + ingrediente.imprimeIngrediente() : "Bacon";
    }

    @Override
    public double valorDoIngrediente() {
        return (ingrediente != null ? ingrediente.valorDoIngrediente() : 0) + PRECO;
    }
}