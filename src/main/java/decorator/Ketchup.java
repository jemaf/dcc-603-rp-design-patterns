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
        if (super.ingrediente != null)
            return "Ketchup, " + super.imprimeIngrediente();
        return "Ketchup";
    }

    @Override
    public double valorDoIngrediente() {
        if (super.ingrediente != null)
            return super.valorDoIngrediente() + 1.00;
        return 1.00;
    }

}
