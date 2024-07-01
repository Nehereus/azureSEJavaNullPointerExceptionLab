package org.example.functions;

public class SuperClass {

    private final String message;

    public SuperClass() {
        message = BadClass.getMessage();
    }

    public String getMessage() {
        return message;
    }
}
