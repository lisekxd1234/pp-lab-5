import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        // dodaj dwie liczby za pomocą metody add z klasy MathUtils
        int liczba1 = 10;
        int liczba2 = 5;
        int suma = MathUtils.add(liczba1, liczba2);
        
        // wyświetl wynik dodawania
        System.out.println("Wynik dodawania: " + suma);
        
        // utwórz instancję EmailMessenger i użyj metody sendMessage
        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Wynik dodawania: " + suma);
    }
}
