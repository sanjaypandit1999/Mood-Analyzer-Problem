package com.bridgelabz;
public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public  String analyseMood() {
        if (message.contains("Sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }
}
