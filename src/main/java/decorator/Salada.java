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
        return "Salada" + ", " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {

        double valor = 0.25;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}
