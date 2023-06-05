package services;

import model.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageService {
    private List<Message> list = new ArrayList<>();

    public MessageService() {
        Message m1 = new Message(1, "First message", "Filip");
        Message m2 = new Message(2, "Second message", "Monika");
        Message m3 = new Message(3, "Third message", "Kasper");

        list.add(m1);
        list.add(m2);
        list.add(m3);
    }

    public List<Message> getAllMessages() {
        return list;
    }
}
