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
        return "Bacon" + (super.ingrediente == null ? "" : ", " + super.ingrediente.imprimeIngrediente());
    }

    @Override
    public double valorDoIngrediente() {
        return 1.50 + (super.ingrediente == null ? 0 : super.ingrediente.valorDoIngrediente());
    }
}
