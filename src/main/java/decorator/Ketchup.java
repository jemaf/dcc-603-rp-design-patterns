package decorator;

public class Ketchup extends IngredienteDecorator {

    private static final String NOME = "Ketchup";
    private static final double PRECO = 1.0;

    public Ketchup() {
        this(null);
    }

    public Ketchup(Ingrediente base) {
        super(base);
    }

    @Override
    public String imprimeIngrediente() {
        return (ingrediente == null) ? NOME : NOME + ", " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        double precoBase = (ingrediente != null) ? ingrediente.valorDoIngrediente() : 0.0;
        return PRECO + precoBase;
    }
}