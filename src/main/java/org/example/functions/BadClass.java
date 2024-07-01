package org.example.functions;

public class BadClass {

    private static final String badString = null;

    static {
        System.out.println(badString.toLowerCase());
    }

    public static String getMessage() {
        return "Hello";
    }
}
