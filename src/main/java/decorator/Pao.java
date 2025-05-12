package decorator;

public class Pao extends IngredienteDecorator {

    public Pao() {
        super(null);
    }

    public Pao(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Pão";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {
        return 1.5 + (super.ingrediente != null ? super.ingrediente.valorDoIngrediente() : 0);
    }
}