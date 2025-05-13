package decorator;

public class Salada extends IngredienteDecorator {

    private static final String nome = "Salada";
    private static final double valor = 0.25;

    public Salada() {
        this(null);
    }

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return (ingrediente == null) ? nome : nome + ", " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        double total = (ingrediente != null) ? ingrediente.valorDoIngrediente() : 0.0;
        return valor + total;
    }
}