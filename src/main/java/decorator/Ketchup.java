package decorator;

public class Ketchup extends IngredienteDecorator {

    private static final String NOME = "Ketchup";
    private static final double PRECO = 1.0;

    public Ketchup() {
        this(null);
    }

    public Ketchup(Ingrediente ingredienteBase) {
        super(ingredienteBase);
    }

    @Override
    public String imprimeIngrediente() {
        String baseDescricao = (ingrediente != null) ? ingrediente.imprimeIngrediente() : "";
        return baseDescricao.isEmpty() ? NOME : baseDescricao + ", " + NOME;
    }

    @Override
    public double valorDoIngrediente() {
        return PRECO + ((ingrediente != null) ? ingrediente.valorDoIngrediente() : 0.0);
    }
}
