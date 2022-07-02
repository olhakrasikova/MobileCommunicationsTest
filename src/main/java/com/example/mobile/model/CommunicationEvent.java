package com.example.mobile.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CommunicationEvent {

    private String messageType;
    private String timestamp;
    private String origin;
    private String destination;
}
