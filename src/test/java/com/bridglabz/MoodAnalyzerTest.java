package com.bridglabz;

import com.bridgelabz.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessageWhenProperShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in sad mood");
        Assertions.assertEquals("Sad",mood);
    }
    @Test
    public void givenMessageWhenProperShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in any mood");
        Assertions.assertEquals("Happy",mood);
    }
}
