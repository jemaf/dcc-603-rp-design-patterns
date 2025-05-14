package decorator;

public class Bacon extends IngredienteDecorator {

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return "Bacon" + ", " + super.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        return 1.50 + super.valorDoIngrediente();
    }
}
