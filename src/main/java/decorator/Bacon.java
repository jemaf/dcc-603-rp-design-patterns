package decorator;

public class Bacon extends IngredienteDecorator {
    public Bacon() {
        super(null);
    }

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return "Bacon, " + this.ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        return 1.50 + (ingrediente != null ? ingrediente.valorDoIngrediente() : 0);
    }
}
