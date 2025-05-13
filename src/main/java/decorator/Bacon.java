package decorator;

public class Bacon extends IngredienteDecorator {

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return "Bacon, " + super.ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        return 1.50 + super.ingrediente.valorDoIngrediente();
    }
}
