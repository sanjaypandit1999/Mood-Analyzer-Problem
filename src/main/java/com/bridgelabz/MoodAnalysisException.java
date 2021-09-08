package com.bridgelabz;

public class MoodAnalysisException extends RuntimeException {
    public enum ExceptionType{
        NULL
    }
    public ExceptionType type;
    public MoodAnalysisException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
