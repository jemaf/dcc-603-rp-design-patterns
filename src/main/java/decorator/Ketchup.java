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
        String ingredientes = getClass().getSimpleName();

        if (super.ingrediente != null) {
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();
        }

        return ingredientes;
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