package decorator;

public class Ketchup extends IngredienteDecorator {

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return ingrediente.imprimeIngrediente() + ", Ketchup";
    }

    @Override
    public Double valorDoIngrediente() {
        return ingrediente.valorDoIngrediente() + 1.00;
    }
} 