package com.bridgelabz;
public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public  String analyseMood() {
        try {
            if (message.contains("Sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }
        catch (Exception e){
            return "Happy";
        }
    }
}
