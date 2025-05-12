package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente produto = new Pao(new Pao());

        // Ingrediente sanduiche1 = new Salada(new Queijo(new Pao()));

        System.out.println(produto.imprimeIngrediente());
        System.out.println(produto.valorDoIngrediente());

        // System.out.println(sanduiche1.imprimeIngrediente());
        // System.out.println(sanduiche1.valorDoIngrediente());
    }
}
