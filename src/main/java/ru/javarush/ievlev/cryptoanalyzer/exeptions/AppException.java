package ru.javarush.ievlev.cryptoanalyzer.exeptions;

public class AppException extends RuntimeException {
    public AppException(String message) {
        super(message);
    }

    public AppException() {
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(Throwable cause) {
        super(cause);
    }
}
