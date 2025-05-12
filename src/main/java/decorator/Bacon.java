package decorator;

public class Bacon extends IngredienteDecorator {

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return super.imprimeIngrediente() + ", Bacon";
    }

    @Override
    public double valorDoIngrediente() {
        return super.valorDoIngrediente() + 1.50;
    }

}
