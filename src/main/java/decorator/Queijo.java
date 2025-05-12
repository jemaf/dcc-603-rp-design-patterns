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
        return "Queijo" + (super.ingrediente == null ? "" : ", " + super.ingrediente.imprimeIngrediente());
    }

    @Override
    public double valorDoIngrediente() {
        return 0.75 + (super.ingrediente == null ? 0 : super.ingrediente.valorDoIngrediente());
    }
}
