package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return super.ingrediente.imprimeIngrediente() + ", Queijo";
    }

    @Override
    public double valorDoIngrediente() {
        return super.ingrediente.valorDoIngrediente() + 0.75;
    }
}
