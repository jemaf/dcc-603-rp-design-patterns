package decorator;

public class Queijo extends IngredienteDecorator {

    private static final String NOME = "Queijo";
    private static final double PRECO = 0.75;

    public Queijo() {
        this(null);
    }

    public Queijo(Ingrediente ingredienteBase) {
        super(ingredienteBase);
    }

    @Override
    public String imprimeIngrediente() {
        String descricaoBase = (ingrediente != null) ? ingrediente.imprimeIngrediente() : "";
        return descricaoBase.isEmpty() ? NOME : descricaoBase + ", " + NOME;
    }

    @Override
    public double valorDoIngrediente() {
        double valorBase = (ingrediente != null) ? ingrediente.valorDoIngrediente() : 0.0;
        return valorBase + PRECO;
    }
}
