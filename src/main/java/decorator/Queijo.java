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
        String descricao = "Queijo";
        if (ingrediente != null) {
            descricao += ", " + ingrediente.imprimeIngrediente();
        }
        return descricao;
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 0.75;
        if (ingrediente != null) {
            valor += ingrediente.valorDoIngrediente();
        }
        return valor;
    }
}
