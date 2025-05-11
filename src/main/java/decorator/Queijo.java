package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo() {
        super(null);
    }

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        String ingredientes = getClass().getSimpleName();

        if (super.ingrediente != null){
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();
        }

        return ingredientes;
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