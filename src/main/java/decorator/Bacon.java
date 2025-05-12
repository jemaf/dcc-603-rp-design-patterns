package decorator;

public class Bacon extends IngredienteDecorator {

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente);
    }

    // Constructor sem argumentos - caso o ingrediente seja o primeiro ou unico
    public Bacon() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        return super.imprimeIngrediente() + ", Bacon";
    }

    @Override
    public double valorDoIngrediente() {
        return super.valorDoIngrediente() + 1.50;
    }

}
