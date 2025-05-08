package decorator;

public class Bacon extends IngredienteDecorator {
    
    public Bacon() {
        super(null);
    }
    
    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        String texto = "Bacon";
        if (ingrediente != null) {
            texto += ", " + ingrediente.imprimeIngrediente();
        }
        return texto;
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
