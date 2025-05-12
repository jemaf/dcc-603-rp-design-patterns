package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente lanche = new Salada(
                new Queijo(
                        new Bacon(
                                new Ketchup(
                                        new Pao()))));

        System.out.println(lanche.imprimeIngrediente());
        System.out.println(lanche.valorDoIngrediente());

    }
}
