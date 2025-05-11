package decorator;

public class Queijo extends IngredienteDecorator {

    private static final String NOME = "Queijo";
    private static final double PRECO = 0.75;

    public Queijo() {
        this(null);
    }

    public Queijo(Ingrediente base) {
        super(base);
    }

    @Override
    public String imprimeIngrediente() {
        return (ingrediente == null) ? NOME : NOME + ", " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        double valorAnterior = (ingrediente != null) ? ingrediente.valorDoIngrediente() : 0.0;
        return PRECO + valorAnterior;
    }
}