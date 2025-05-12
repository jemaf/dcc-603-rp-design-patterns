package decorator;

public class Ketchup extends IngredienteDecorator {

    public Ketchup() {
        super(null);
    }

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Ketchup";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {
        return 1.00 + (super.ingrediente != null ? super.ingrediente.valorDoIngrediente() : 0);
    }
}