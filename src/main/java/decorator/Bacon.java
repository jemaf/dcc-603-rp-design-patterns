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
        String descricao = "Bacon";
        if (ingrediente != null) {
            descricao += ", " + ingrediente.imprimeIngrediente();
        }
        return descricao;
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 1.50;
        if (ingrediente != null) {
            valor += ingrediente.valorDoIngrediente();
        }
        return valor;
    }
}
