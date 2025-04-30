package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Queijo() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        return "Queijo" + (ingrediente != null ? ", " + ingrediente.imprimeIngrediente() : "");
    }

    @Override
    public double valorDoIngrediente() {
        return 0.75 + (ingrediente != null ? ingrediente.valorDoIngrediente() : 0);
    }
}
