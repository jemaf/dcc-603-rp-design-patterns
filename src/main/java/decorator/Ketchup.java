package decorator;

public class Ketchup extends IngredienteDecorator {

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    // Constructor sem argumentos - caso o ingrediente seja o primeiro ou unico
    public Ketchup() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        return super.imprimeIngrediente() + ", Ketchup";
    }

    @Override
    public double valorDoIngrediente() {
        return super.valorDoIngrediente() + 1.00;
    }

}
