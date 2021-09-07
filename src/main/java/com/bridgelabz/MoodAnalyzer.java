package com.bridgelabz;
public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) throws MoodAnalysisException {
        this.message = message;
    }

    public  String analyseMood() throws MoodAnalysisException {
        try {
            if (message.contains("Sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }
        catch (Exception e){
            throw new MoodAnalysisException("Please enter proper message");
        }
    }
}
