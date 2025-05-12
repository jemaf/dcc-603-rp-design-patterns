package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente produto = new Salada(
                                new Queijo(
                                    new Bacon(
                                        new Ketchup(
                                            new Pao()
                                        )
                                    )
                                )
                            );

        System.out.println(produto.imprimeIngrediente());
        System.out.println(produto.valorDoIngrediente());
    }
}