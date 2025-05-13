package decorator;

public class Ketchup extends IngredienteDecorator {

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Ketchup() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Ketchup";
        if (ingrediente != null)
            ingredientes += ", " + ingrediente.imprimeIngrediente();
        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 1.0;
        if (ingrediente != null)
            valor += ingrediente.valorDoIngrediente();
        return valor;
    }
}
