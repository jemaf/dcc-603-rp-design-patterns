package decorator;

public class Ketchup extends IngredienteDecorator{

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return super.ingrediente.imprimeIngrediente() + ", Ketchup";
    }

    @Override
    public double valorDoIngrediente() {
        return super.ingrediente.valorDoIngrediente() + 1.00;
    }
}
