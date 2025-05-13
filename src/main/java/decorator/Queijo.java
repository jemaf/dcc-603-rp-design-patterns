package decorator;

public class Queijo extends IngredienteDecorator {
    public Queijo() {
        super(null);
    }

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return "Queijo, " + this.ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        return 0.75 + (ingrediente != null ? ingrediente.valorDoIngrediente() : 0);
    }
}
