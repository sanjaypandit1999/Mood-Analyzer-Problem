package com.bridgelabz;
public class MoodAnalyzer {
    private String message;
    public  String analyseMood(String message) {
        if (message.contains("SAD")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }
}
