package com.example.mobile.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message extends CommunicationEvent {

    String messageContent;
    String messageStatus;

    public Message(String messageType, String timestamp, String origin, String destination,
                   String messageContent, String messageStatus){
        super(messageType, timestamp, origin, destination);
        this.messageContent = messageContent;
        this.messageStatus = messageStatus;
    }
}
