package decorator;

public class Bacon extends IngredienteDecorator {

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return super.ingrediente.imprimeIngrediente() + ", Bacon";
    }

    @Override
    public double valorDoIngrediente() {
        return super.ingrediente.valorDoIngrediente() + 1.50;
    }
}
