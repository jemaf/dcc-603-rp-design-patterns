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
        String ingredientes = "Salada";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {
        return 0.25 + (super.ingrediente != null ? super.ingrediente.valorDoIngrediente() : 0);
    }
}