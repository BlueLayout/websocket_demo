package com.oocl.websocketdemo.model;

import lombok.Data;

public class ChatMessage {

    private MessageType messageType;

    private String content;

    private String sender;

    public enum MessageType {
        CHAT,
        JOIN, LEAVE
    }

    public MessageType getType() {
        return messageType;
    }

    public void setType(MessageType type) {
        this.messageType = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
