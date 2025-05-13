package decorator;

public class Bacon extends IngredienteDecorator {
    private static double PRICE = 1.5;

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Bacon() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientesIniciais = "";
        if (super.ingrediente != null) ingredientesIniciais = super.ingrediente.imprimeIngrediente();

        return getClass().getSimpleName() + ", " + ingredientesIniciais;
    }

    @Override
    public double valorDoIngrediente() {
        double valorInicial = 0;
        if (super.ingrediente != null) valorInicial += super.ingrediente.valorDoIngrediente();

        return valorInicial + PRICE;
    }
}
