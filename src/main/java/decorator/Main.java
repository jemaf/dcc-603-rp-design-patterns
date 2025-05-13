package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente pedido = new Pao();
        pedido = new Ketchup(pedido);
        pedido = new Bacon(pedido);
        pedido = new Queijo(pedido);
        pedido = new Salada(pedido);

        System.out.println(pedido.imprimeIngrediente());
        System.out.println(pedido.valorDoIngrediente());

    }
}
