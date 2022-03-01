package com.company;

public class InvalidIssueYear extends RuntimeException{
    public InvalidIssueYear() {
    }

    public InvalidIssueYear(String message) {
        super(message);
    }

    public InvalidIssueYear(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIssueYear(Throwable cause) {
        super(cause);
    }

    public InvalidIssueYear(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
