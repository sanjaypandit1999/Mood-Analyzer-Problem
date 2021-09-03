package com.bridglabz;

import com.bridgelabz.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageWhenProperShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("Sad",mood);
    }
    @Test
    public void givenMessageWhenProperShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals("Happy",mood);
    }

}
