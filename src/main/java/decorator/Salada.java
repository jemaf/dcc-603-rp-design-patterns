package decorator;

public class Salada extends IngredienteDecorator {

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Salada() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = "Salada";
        if (ingrediente != null)
            ingredientes += ", " + ingrediente.imprimeIngrediente();
        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 0.25;
        if (ingrediente != null)
            valor += ingrediente.valorDoIngrediente();
        return valor;
    }
}
