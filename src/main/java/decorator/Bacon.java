package decorator;

public class Bacon extends IngredienteDecorator {

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Bacon() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Bacon";
        if (ingrediente != null) {
            ingredientes += ", " + ingrediente.imprimeIngrediente();
        }
        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 1.50;
        if (ingrediente != null) {
            valor += ingrediente.valorDoIngrediente();
        }
        return valor;
    }
}