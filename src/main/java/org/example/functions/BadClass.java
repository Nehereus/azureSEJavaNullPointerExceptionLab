package org.example.functions;

public class BadClass {

    private static final String badString = "Hello World!";

    static {
        System.out.println(badString.toLowerCase());
    }

    public static String getMessage() {
        return "Hello";
    }
}
