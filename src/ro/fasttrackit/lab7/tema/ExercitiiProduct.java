package ro.fasttrackit.lab7.tema;

public class ExercitiiProduct {
    public static void main(String[] args) {
        Product produs1 = new Product("lapte", 4.5, 200, "lactate");
        Product produs2 = new Product("oua", 1, 300, "oua");
        Product produs3 = new Product("faina de grau", 2.5, 50, "fainoase");
        printProduse(produs1);
        printProduse(produs2);
        printProduse(produs3);
        System.out.println(produs1.isCategory("lactate"));
        System.out.println(produs1.isCategory("fainoase"));
        System.out.println(produs2.hasStock());

    }

    public static void printProduse(Product produs) {
        System.out.println("Produsul este: " + produs.getName());
        System.out.println("Pretul acestui produs: " + produs.getPrice());
        System.out.println("Cantitatea disponibila: " + produs.getQuantity());
        System.out.println("Se gaseste la categoria: " + produs.getCategory());
    }
}
