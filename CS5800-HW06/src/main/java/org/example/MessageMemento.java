package org.example;

public class MessageMemento {
    private Message message;
    // A class that represents a snapshot of a message sent by a user. It should have
    //properties for the message content and timestamp.

    public Message getPreviousMessage(){
        return message;
    }

    public MessageMemento(Message message){
        this.message = message;
    }

}
