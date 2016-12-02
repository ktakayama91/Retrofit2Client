package com.example;

/**
 * @author Kei Takayama
 * Created on 12/1/16.
 */
public class GreetingsImpl implements Greetings {

    private final long id;

    private final String content;

    public GreetingsImpl(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
