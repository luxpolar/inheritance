import ar.com.ada.oop.override.Person;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Luciana", "Consiglio");
        Person person2 = new Person("Julian", "Kuper");
        Person person3 = new Person("Ana", "Frei");
        Person person4 = new Person("Ana", "Frei");

        System.out.println("person1 = " + person1.toString());
        System.out.println("person2 = " + person2.toString());
        System.out.println("person3 = " + person3.toString());
        System.out.println("person4 = " + person4.toString());
        System.out.println("person1 = " + person1.hashCode());
        System.out.println("person2 = " + person2.hashCode());
        System.out.println("person3 = " + person3.hashCode());
        System.out.println("person4 = " + person4.hashCode());
        System.out.println("person4.equals(person1) = " + person4.equals(person1));
        System.out.println("person4.equals(person2) = " + person4.equals(person2));
        System.out.println("person4.equals(person3) = " + person4.equals(person3));
    }
}
