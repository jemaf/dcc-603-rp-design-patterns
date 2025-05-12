package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente produto = new Pao(new Salada(new Bacon(new Queijo( new Ketchup()))));

        System.out.println(produto.imprimeIngrediente());
        System.out.println(produto.valorDoIngrediente());

    }
}
