package decorator;

public class Salada extends IngredienteDecorator {
    public Salada() {
        super(null);
    }

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return "Salada, " + this.ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        return 0.25 + (ingrediente != null ? ingrediente.valorDoIngrediente() : 0);
    }
}
