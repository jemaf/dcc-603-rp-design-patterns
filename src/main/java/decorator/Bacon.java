package decorator;

public class Bacon extends IngredienteDecorator {

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Bacon() {
        this(new Pao());
    }

    @Override
    public String imprimeIngrediente() {
        return ingrediente.imprimeIngrediente() + ", Bacon";
    }

    @Override
    public double valorDoIngrediente() {
        return ingrediente.valorDoIngrediente() + 1.50;
    }
}
