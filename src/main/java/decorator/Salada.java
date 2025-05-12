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
        String descricao = "Salada";
        if (ingrediente != null) {
            descricao += ", " + ingrediente.imprimeIngrediente();
        }
        return descricao;
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 0.25;
        if (ingrediente != null) {
            valor += ingrediente.valorDoIngrediente();
        }
        return valor;
    }
}
