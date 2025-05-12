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
        String ingredientes = "Queijo";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {
        return 0.75 + (super.ingrediente != null ? super.ingrediente.valorDoIngrediente() : 0);
    }
}