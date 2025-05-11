package decorator;

public class Salada extends IngredienteDecorator {

    private static final String NOME = "Salada";
    private static final double PRECO = 0.25;

    public Salada() {
        this(null);
    }

    public Salada(Ingrediente base) {
        super(base);
    }

    @Override
    public String imprimeIngrediente() {
        return (ingrediente == null) ? NOME : NOME + ", " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        double total = (ingrediente != null) ? ingrediente.valorDoIngrediente() : 0.0;
        return PRECO + total;
    }
}