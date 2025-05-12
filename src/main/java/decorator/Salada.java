package decorator;

public class Salada extends IngredienteDecorator {

    private static final String NOME = "Salada";
    private static final double PRECO = 0.25;

    public Salada() {
        this(null);
    }

    public Salada(Ingrediente ingredienteBase) {
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
