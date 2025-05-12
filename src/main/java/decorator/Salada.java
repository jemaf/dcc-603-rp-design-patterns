package decorator;

public class Salada extends IngredienteDecorator {

    public Salada(Ingrediente ingrediente) {
        super(ingrediente);
    }

    // Constructor sem argumentos - caso o ingrediente seja o primeiro ou unico
    public Salada() {
        super(null);
    }

    @Override
    public String imprimeIngrediente() {
        if (super.ingrediente != null)
            return "Salada, " + super.imprimeIngrediente();
        return "Salada";
    }

    @Override
    public double valorDoIngrediente() {
        if (super.ingrediente != null)
            return super.valorDoIngrediente() + 0.25;
        return 0.25;
    }

}
