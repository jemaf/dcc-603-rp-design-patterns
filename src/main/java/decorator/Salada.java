package decorator;

public class Salada extends IngredienteDecorator {
    private static final double PRECO = 0.25;

    public Salada() {
        super(null);
    }

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return ingrediente != null ?
                "Salada, " + ingrediente.imprimeIngrediente() : "Salada";
    }

    @Override
    public double valorDoIngrediente() {
        return (ingrediente != null ? ingrediente.valorDoIngrediente() : 0) + PRECO;
    }
}