package ru.kolesnik.cinemarestservice.exception;

public class WrongPasswordException extends RuntimeException {

    private final String message;

    public WrongPasswordException() {
        this.message = "The password is wrong!";
    }

    public String getMessage() {
        return message;
    }
}
