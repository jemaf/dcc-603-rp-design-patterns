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
        if (super.ingrediente != null)
            return "Bacon, " + super.imprimeIngrediente();
        return "Bacon";
    }

    @Override
    public double valorDoIngrediente() {
        if (super.ingrediente != null)
            return super.valorDoIngrediente() + 1.50;
        return 1.50;
    }

}
