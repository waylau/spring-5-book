/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.websocket.handler.vo;

/**
 * Chat Message.
 * 
 * @since 1.0.0 2018年4月4日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
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