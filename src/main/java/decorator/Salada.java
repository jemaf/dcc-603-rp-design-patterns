package decorator;

public class Salada extends IngredienteDecorator {

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Salada() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        return "Salada" + (ingrediente != null ? ", " + ingrediente.imprimeIngrediente() : "");
    }

    @Override
    public double valorDoIngrediente() {
        return 0.25 + (ingrediente != null ? ingrediente.valorDoIngrediente() : 0);
    }
}