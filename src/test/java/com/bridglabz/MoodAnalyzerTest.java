package com.bridglabz;

import com.bridgelabz.MoodAnalysisException;
import com.bridgelabz.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageWhenProperShouldReturnSad() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Sad");
            String mood = moodAnalyzer.analyseMood();
            Assertions.assertEquals("Sad",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenNullMoodShouldReturnProperMessageToUser() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
             String mood = moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.NULL, e.type);
            System.out.println(e.getMessage());
        }
    }

}
