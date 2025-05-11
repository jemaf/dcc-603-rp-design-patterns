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
        String ingredientes = getClass().getSimpleName();

        if (super.ingrediente != null) {
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();
        }

        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 0.25;
        if (ingrediente != null) {
            valor += ingrediente.valorDoIngrediente();
        }

        return valor;
    }
}