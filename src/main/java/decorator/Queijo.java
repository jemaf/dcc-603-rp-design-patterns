package decorator;

public class Queijo extends IngredienteDecorator {
    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Queijo() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        if (ingrediente == null) {
            return "Queijo";
        }
        return "Queijo, " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        if (ingrediente == null) {
            return 0.75;
        }
        return 0.75 + ingrediente.valorDoIngrediente();
    }
}