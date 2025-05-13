package decorator;

public class Main {
    public static void main(String[] args) {
        Ingrediente produto = new Pao();
        produto = new Ketchup(produto);
        produto = new Bacon(produto);
        produto = new Queijo(produto);
        produto = new Salada(produto);

        System.out.println("Ingredientes: " + produto.imprimeIngrediente());
        System.out.println("Preço total: R$" + produto.valorDoIngrediente());
    }
}
