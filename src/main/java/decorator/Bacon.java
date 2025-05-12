package decorator;

public class Bacon extends IngredienteDecorator {

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Bacon() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        return "Bacon, " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 1.5;
        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();
        return valor;
    }
}