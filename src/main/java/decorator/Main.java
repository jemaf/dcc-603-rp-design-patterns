package decorator;

public class Main {
    public static void main(String[] args) {
        // Exemplo: Pão + Bacon + Queijo + Salada + Ketchup
        Ingrediente lanche = new Pao();
        lanche = new Bacon(lanche);
        lanche = new Queijo(lanche);
        lanche = new Salada(lanche);
        lanche = new Ketchup(lanche);

        System.out.println(lanche.imprimeIngrediente());

        System.out.println("Preço total: R$" + lanche.valorDoIngrediente());
    }
}