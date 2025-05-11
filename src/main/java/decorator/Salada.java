package decorator;

public class Salada extends IngredienteDecorator {
    private static double PRICE = 0.25;

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Salada() {
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
