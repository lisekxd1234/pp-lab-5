import company.beans.Person;
import company.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            // utwórz instancję Person
            Person person = new Person("John", 30);
            
            // wypisz dane
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            // obsłuż wyjątek
            System.out.println("Invalid age: " + e.getMessage());
        }
    }
}
