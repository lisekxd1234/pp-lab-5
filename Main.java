import company.implementations.EmailMessenger;
import company.interfaces.Messenger;

public class Main {
    public static void main(String[] args) {
        // w metodzie main utwórz instancję EmailMessenger i użyj metody sendMessage
        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("To jest nowa wiadomosc email");
    }
}
