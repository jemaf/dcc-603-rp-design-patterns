package decorator;

public class Pao implements Ingrediente {
    @Override
    public String imprimeIngrediente() {
        return "Pão";
    }

    @Override
    public double valorDoIngrediente() {
        return 1.5;
    }
}