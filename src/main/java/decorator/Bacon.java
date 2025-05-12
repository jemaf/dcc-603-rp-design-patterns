package decorator;

public class Bacon extends IngredienteDecorator {

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Bacon() {
        this(null);
    }

    @Override
    public String imprimeIngrediente() {
        return "Bacon" + (ingrediente != null ? ", " + ingrediente.imprimeIngrediente() : "");
    }

    @Override
    public double valorDoIngrediente() {
        return 1.50 + (ingrediente != null ? ingrediente.valorDoIngrediente() : 0);
    }
}
