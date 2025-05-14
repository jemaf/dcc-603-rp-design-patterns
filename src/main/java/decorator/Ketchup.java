package decorator;

public class Ketchup extends IngredienteDecorator {

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return "Ketchup" + ", " + super.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        return 1.00 + super.valorDoIngrediente();
    }
}
