package decorator;

public class Salada extends IngredienteDecorator {

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Salada() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        return "Salada" + (super.ingrediente == null ? "" : ", " + super.ingrediente.imprimeIngrediente());
    }

    @Override
    public double valorDoIngrediente() {
        return 0.25 + (super.ingrediente == null ? 0 : super.ingrediente.valorDoIngrediente());
    }
}
