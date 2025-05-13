package decorator;

public class Queijo extends IngredienteDecorator {
    private static double PRICE = 0.75;

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Queijo() {
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
