package decorator;

public class Salada extends IngredienteDecorator {

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return super.imprimeIngrediente() + ", Salada";
    }

    @Override
    public double valorDoIngrediente() {
        return super.valorDoIngrediente() + 0.25;
    }

}
