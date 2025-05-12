package decorator;

public class Ketchup extends IngredienteDecorator {

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    public Ketchup() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        String descricao = "Ketchup";
        if (ingrediente != null) {
            descricao += ", " + ingrediente.imprimeIngrediente();
        }
        return descricao;
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 1.00;
        if (ingrediente != null) {
            valor += ingrediente.valorDoIngrediente();
        }
        return valor;
    }
}
