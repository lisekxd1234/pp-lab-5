package company.implementations;

import company.interfaces.Messenger;

public class EmailMessenger implements Messenger {
    // klasa ta, implementuje interfejs Messenger i wypisuje wiadomość w konsoli przy pomocy System.out.println
    // poprzez przeciążanie metody sendMessage
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}
