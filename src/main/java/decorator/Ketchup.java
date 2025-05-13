package decorator;

public class Ketchup extends IngredienteDecorator {
    private static double PRICE = 1;

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Ketchup() {
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
