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
        return "Ketchup, " + ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        double valor = 1.0;
        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();
        return valor;
    }
}