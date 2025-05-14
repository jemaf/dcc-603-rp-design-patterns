package decorator;

public class Salada extends IngredienteDecorator {

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return "Salada" + ", " + super.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        return 0.25 + super.valorDoIngrediente();
    }
}
