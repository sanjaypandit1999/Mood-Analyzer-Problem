package com.bridgelabz;
public class MoodAnalyzer {
    private String message;
    public  String analyseMood(String message) {
        if (message.contains("I am in sad mood")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }
}
