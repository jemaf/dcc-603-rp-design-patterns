package decorator;

public class Salada extends IngredienteDecorator {
    
    public Salada() {
        super(null);
    }

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        String texto = "Salada";
        if (ingrediente != null) {
            texto += ", " + ingrediente.imprimeIngrediente();
        }
        return texto;
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
