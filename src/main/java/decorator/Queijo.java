package decorator;

public class Queijo extends IngredienteDecorator {

    private static final String nome = "Queijo";
    private static final double valor = 0.75;

    public Queijo() {
        this(null);
    }

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return (ingrediente == null) ? nome : nome + ", " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        double valorAnterior = (ingrediente != null) ? ingrediente.valorDoIngrediente() : 0.0;
        return valor + valorAnterior;
    }
}