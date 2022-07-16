package ru.kolesnik.cinemarestservice.exception;

public class WrongTokenException extends RuntimeException {

    private final String message;

    public WrongTokenException() {
        this.message = "Wrong token!";
    }

    public String getMessage() {
        return message;
    }
}
