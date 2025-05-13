package decorator;

public class Bacon extends IngredienteDecorator {

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return ingrediente.imprimeIngrediente() + ", Bacon";
    }

    @Override
    public Double valorDoIngrediente() {
        return ingrediente.valorDoIngrediente() + 1.50;
    }
} 