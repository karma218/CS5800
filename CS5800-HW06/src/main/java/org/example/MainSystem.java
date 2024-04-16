package org.example;
import java.util.Iterator;
import java.util.List;



public class MainSystem {
    private static final ChatServer chatServer = new ChatServer();

    public static void main(String[] args) {
        //creating 3 users and adding them to system
        User u1 = new User("Karma", chatServer);
        User u2 = new User("Chicle", chatServer);
        User u3 = new User("Zoro", chatServer);

        chatServer.sendMessage(new Message(u1, List.of(u2), "Hey, Chicle! What should I make for dinner tonight?"));
        chatServer.sendMessage(new Message(u3, List.of(u2), "Hi Chicle, How was your day?"));
        chatServer.sendMessage(new Message(u2, List.of(u3,u1), "Hey, are u up for the party? "));
        chatServer.sendMessage(new Message(u2, List.of(u1), "Karma, Thanks I will have pav bhaji. "));
        chatServer.sendMessage(new Message(u1, List.of(u2,u3), "Hi, are you down for game night?!"));

        System.out.println("\n===== Demo of the block function =====");
        u2.blockerUsers(u1);
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(u1, List.of(u2, u3), "Hey, I want to go to Pizza Hut are you coming?!"));
        System.out.println("----------------------------------");
        chatServer.sendMessage(new Message(u3, List.of(u1), "Why Pizza Hut, Karma?"));
        System.out.println("----------------------------------");
        System.out.println("\n===== Demo of unsent function =====");
        System.out.println("Zoro unsent the last message");
        chatServer.undoLastMessage(u3);
        System.out.printf("Now, Zoro's last message is '%s'\n", u3.getChatHistory().getLastSentMessages());
        System.out.println("----------------------------------");
        System.out.println("\n===== Demonstrating unsent function =====");
        System.out.println("Chicle unsent last message:");
        chatServer.undoLastMessage(u2);
        System.out.println("----------------------------------");
        // Trying iterating over all messages in user3's chat history
        System.out.println("Iterating over all messages in Zoro's chat history:");
        Iterator<Message> allMessagesIterator = u3.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.printf("------------------------------------\n");
        // iterating over all messages in user1's chat history
        System.out.println("Iterating over all messages in Karma's chat history:");
        allMessagesIterator = u1.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }
        System.out.printf("------------------------------------\n");
        chatServer.unregisterUser(u1);
        chatServer.sendMessage(new Message(u3, List.of(u1), "Because I want to have the cheesecakes from there."));
    }
}
