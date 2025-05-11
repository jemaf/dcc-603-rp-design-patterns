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
        if (ingrediente == null) {
            return "Salada";
        }
        return "Salada, " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        if (ingrediente == null) {
            return 0.25;
        }
        return 0.25 + ingrediente.valorDoIngrediente();
    }
}