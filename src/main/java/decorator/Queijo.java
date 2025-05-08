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
        String texto = "Queijo";
        if (ingrediente != null) {
            texto += ", " + ingrediente.imprimeIngrediente();
        }
        return texto;
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
