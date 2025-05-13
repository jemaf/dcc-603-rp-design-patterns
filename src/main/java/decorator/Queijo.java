package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Queijo() {
        this(new Pao());
    }

    @Override
    public String imprimeIngrediente() {
        return ingrediente.imprimeIngrediente() + ", Queijo";
    }

    @Override
    public double valorDoIngrediente() {
        return ingrediente.valorDoIngrediente() + 0.75;
    }
}
