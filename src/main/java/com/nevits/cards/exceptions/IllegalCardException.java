package com.nevits.cards.exceptions;

public class IllegalCardException extends Exception {

    public IllegalCardException(String message) {
        super(message);
    }

    public IllegalCardException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public IllegalCardException() {
        super();
    }

}
