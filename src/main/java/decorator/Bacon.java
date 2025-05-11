package decorator;

public class Bacon extends IngredienteDecorator {

    private static final double PRECO_BACON = 1.5;
    private static final String NOME_INGREDIENTE = "Bacon";

    public Bacon() {
        this(null);
    }

    public Bacon(Ingrediente base) {
        super(base);
    }

    @Override
    public String imprimeIngrediente() {
        if (ingrediente == null) {
            return NOME_INGREDIENTE;
        }
        return NOME_INGREDIENTE + ", " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        double adicional = (ingrediente != null) ? ingrediente.valorDoIngrediente() : 0.0;
        return PRECO_BACON + adicional;
    }
}