package com.service.restservice;

import java.util.Objects;

public class Message {
    private final long id;
    private final String message;
    private final String level;
    private final String offset;

    public Message(long id, String message, String level, String offset) {
        this.id = id;
        this.message = message;
        this.level = level;
        this.offset = offset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message1 = (Message) o;
        return getId() == message1.getId() &&
                Objects.equals(getMessage(), message1.getMessage()) &&
                Objects.equals(getLevel(), message1.getLevel()) &&
                Objects.equals(getOffset(), message1.getOffset());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMessage(), getLevel(), getOffset());
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getLevel() {
        return level;
    }

    public String getOffset() {
        return offset;
    }
}
