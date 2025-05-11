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
        String ingredientes = getClass().getSimpleName();

        if (super.ingrediente != null) {
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();
        }

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 1.50;

        if (super.ingrediente != null) {
            valor += super.ingrediente.valorDoIngrediente();
        }

        return valor;
    }
}