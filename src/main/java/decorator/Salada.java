package decorator;

public class Salada extends IngredienteDecorator {

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return "Salada, " + super.ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        return 0.25 + super.ingrediente.valorDoIngrediente();
    }
}
