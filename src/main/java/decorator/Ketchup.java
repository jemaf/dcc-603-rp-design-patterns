package decorator;

public class Ketchup extends IngredienteDecorator {

    public Ketchup() {
        super(null);
    }

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        String texto = "Ketchup";
        if (ingrediente != null) {
            texto += ", " + ingrediente.imprimeIngrediente();
        }
        return texto;
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
