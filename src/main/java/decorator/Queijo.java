package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return "Queijo" + ", " + super.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        return 0.75 + super.valorDoIngrediente();
    }
}
