package decorator;

public class Ketchup extends IngredienteDecorator {

    private static final String nome = "Ketchup";
    private static final double valor = 1.0;

    public Ketchup() {
        this(null);
    }

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return (ingrediente == null) ? nome : nome + ", " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        double total = (ingrediente != null) ? ingrediente.valorDoIngrediente() : 0.0;
        return valor + total;
    }
}