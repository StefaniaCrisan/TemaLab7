package ro.fasttrackit.lab7.tema;

public class Tema {
    public static void main(String[] args) {
        Person persoana1 = new Person("Ionel",20);
        Person persoana2 = new Person("Georgel",32);
        Person persoana3 = new Person("Maria",25);

        printPersons(persoana1);
        printPersons(persoana2);
        printPersons(persoana3);

    }
    public static void printPersons(Person persoana){
        System.out.println("Persoana este: "+persoana.getName());
        System.out.println("Varsta este: "+persoana.getAge());
    }
}
