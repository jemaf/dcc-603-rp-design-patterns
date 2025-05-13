package decorator;

public class Bacon extends IngredienteDecorator {

    private static final String nome = "Bacon";
    private static final double valor = 1.50;

    public Bacon() {
        this(null);
    }

    public Bacon(Ingrediente ingrediente) {
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