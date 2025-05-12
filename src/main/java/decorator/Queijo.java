package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(Ingrediente ingrediente) {
        super(ingrediente);
    }

    // Constructor sem argumentos - caso o ingrediente seja o primeiro ou unico
    public Queijo() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        return super.imprimeIngrediente() + ", Queijo";
    }

    @Override
    public double valorDoIngrediente() {
        return super.valorDoIngrediente() + 0.75;
    }

}
