package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return ingrediente.imprimeIngrediente() + ", Queijo";
    }

    @Override
    public Double valorDoIngrediente() {
        return ingrediente.valorDoIngrediente() + 0.75;
    }
} 