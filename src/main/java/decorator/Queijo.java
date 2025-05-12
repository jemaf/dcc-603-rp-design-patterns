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
        if (super.ingrediente != null)
            return "Queijo, " + super.imprimeIngrediente();
        return "Queijo";
    }

    @Override
    public double valorDoIngrediente() {
        if (super.ingrediente != null)
            return super.valorDoIngrediente() + 0.75;
        return 0.75;
    }

}
