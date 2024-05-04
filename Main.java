import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        // utwórz tablicę people z pięcioma obiektami instancji Person
        Person[] people = new Person[5];
        
        // utwórz stałą b o wartości 10
        final int b = 10;
        
        // w bloku try-catch przypisz dla każdej instancji nową instancję Person
        try {
            people[0] = new Person("Jan Kowalski", 30);
            people[1] = new Person("Anna Nowak", 25);
            people[2] = new Person("Marek Wiśniewski", 35);
            people[3] = new Person("Katarzyna Dąbrowska", 40);
            people[4] = new Person("Piotr Lewandowski", 45);
        } catch (InvalidAgeException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
        
        // wylicz dla każdej osoby z osobna wartość za pomocą metody add z MathUtils
        // wykorzystując jako argument a wiek danej osoby a argument b, utworzoną wcześniej stałą
        for (Person person : people) {
            int suma = MathUtils.add(person.getAge(), b);
            
            // wykorzystaj wyliczoną wartość w treści wiadomości metody sendMessage
            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("Wynik dodawania wieku " + person.getName() + " (" + person.getAge() + ") i " + b + " to: " + suma);
        }
    }
}
