package ro.fasttrackit.lab7.tema;

public class ExercitiiBottle {
    public static void main(String[] args) {
        Bottle sticla = new Bottle(100, 76.5);

        System.out.println("Capacitatea sticlei: " + sticla.getTotalCapacity());
        System.out.println("Cantitatea de lichid: " + sticla.getAvailableLiquid());
        System.out.println("Capacitatea ramasa disponibila: " + sticla.emptyCapacity());
        System.out.println("Sticla este deschisa? " + sticla.isOpen());
        System.out.println("Deschide sticla");
        sticla.open();
        sticla.hasLiquid();
        sticla.drink(12);
        sticla.close();
        sticla.drink(37.47);
        sticla.open();
        sticla.drink(80);
        sticla.open();
        sticla.close();
        sticla.close();
    }
}
