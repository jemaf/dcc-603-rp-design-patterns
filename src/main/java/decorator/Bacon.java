package decorator;

public class Bacon extends IngredienteDecorator {
    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Bacon() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        if (ingrediente == null) {
            return "Bacon";
        }
        return "Bacon, " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        if (ingrediente == null) {
            return 1.5;
        }
        return 1.5 + ingrediente.valorDoIngrediente();
    }
}