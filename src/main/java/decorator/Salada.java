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
        return super.imprimeIngrediente() + ", Salada";
    }

    @Override
    public double valorDoIngrediente() {
        return super.valorDoIngrediente() + 0.25;
    }

}
