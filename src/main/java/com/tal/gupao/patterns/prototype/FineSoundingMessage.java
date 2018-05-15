package com.tal.gupao.patterns.prototype;

public class FineSoundingMessage implements Cloneable {

    private String message = "Hi honey! I love you!";

    public String getMessage() {
        return message;
    }

    @Override
    protected FineSoundingMessage clone() throws CloneNotSupportedException {
        return (FineSoundingMessage) super.clone();
    }
}
