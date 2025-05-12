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
        String ingredientes = "Bacon";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {
        return 1.50 + (super.ingrediente != null ? super.ingrediente.valorDoIngrediente() : 0);
    }
}