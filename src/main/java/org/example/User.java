package org.example;

import java.text.Collator;

public class User {
    private final String password = "abc$123";

    public boolean validate(String passwordGuess) {
        return passwordGuess.equals(password);
    }
}
