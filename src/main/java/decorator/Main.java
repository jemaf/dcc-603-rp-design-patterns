package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente sanduiche = new Bacon(new Queijo(new Salada(new Ketchup(new Pao()))));

        System.out.println(sanduiche.imprimeIngrediente());
        System.out.println("Preço total: R$ " + sanduiche.valorDoIngrediente());
    }
}