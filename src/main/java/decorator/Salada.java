package decorator;

public class Salada extends IngredienteDecorator {

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return ingrediente.imprimeIngrediente() + ", Salada";
    }

    @Override
    public Double valorDoIngrediente() {
        return ingrediente.valorDoIngrediente() + 0.25;
    }
} 