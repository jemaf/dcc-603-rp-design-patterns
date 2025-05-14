package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente pedido = new Salada(
                new Queijo(
                        new Bacon(
                                new Ketchup(
                                        new Pao()
                                )
                        )
                )
        );

        System.out.println(pedido.imprimeIngrediente());
        System.out.println(pedido.valorDoIngrediente());
    }
}

