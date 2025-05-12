package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente produto1 = new Pao(new Pao());
        Ingrediente produto2 = new Ketchup(new Ketchup());
        Ingrediente produto3 = new Queijo(new Queijo());
        Ingrediente produto4 = new Bacon(new Bacon());
        Ingrediente produto5 = new Salada(new Salada());

        // pao
        System.out.println(produto1.imprimeIngrediente());
        System.out.println(produto1.valorDoIngrediente());
    }
}
