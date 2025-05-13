package decorator;

public class Ketchup extends IngredienteDecorator {

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    // Construtor extra para testes automatizados
    public Ketchup() {
        this(new Pao());
    }

    @Override
    public String imprimeIngrediente() {
        return ingrediente.imprimeIngrediente() + ", Ketchup";
    }

    @Override
    public double valorDoIngrediente() {
        return ingrediente.valorDoIngrediente() + 1.00;
    }
}
