package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return super.imprimeIngrediente() + ", Queijo";
    }

    @Override
    public double valorDoIngrediente() {
        return super.valorDoIngrediente() + 0.75;
    }

}




