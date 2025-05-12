package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Queijo() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Queijo";
        if (ingrediente != null) {
            ingredientes += ", " + ingrediente.imprimeIngrediente();
        }
        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 0.75;
        if (ingrediente != null) {
            valor += ingrediente.valorDoIngrediente();
        }
        return valor;
    }
}