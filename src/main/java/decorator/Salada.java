package decorator;

public class Salada extends IngredienteDecorator {

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Salada() {
        this(new Pao());
    }

    @Override
    public String imprimeIngrediente() {
        return ingrediente.imprimeIngrediente() + ", Salada";
    }

    @Override
    public double valorDoIngrediente() {
        return ingrediente.valorDoIngrediente() + 0.25;
    }
}
