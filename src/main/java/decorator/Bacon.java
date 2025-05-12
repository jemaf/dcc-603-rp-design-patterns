package decorator;

public class Bacon extends IngredienteDecorator {

    private static final double PRECO = 1.5;
    private static final String NOME = "Bacon";

    public Bacon() {
        this(null);
    }

    public Bacon(Ingrediente ingredienteBase) {
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
