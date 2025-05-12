package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Queijo() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        return "Queijo" + ", " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {

        double valor = 0.75;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}