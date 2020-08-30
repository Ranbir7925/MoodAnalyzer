package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest
{

    @Test
    public void testSadMood()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("SAD",mood);

    }

    @Test
    public void testHappyMood()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void testAnyMood()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void nullInput() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            String mood = moodAnalyzer.analyzeMood();
        }
        catch (MoodAnalyzerException e) {
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.NULL, e.type);
        }
    }

    @Test
    public void testEmptyInput() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try{
            String mood = moodAnalyzer.analyzeMood();
        }
        catch (MoodAnalyzerException e){
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.EMPTY,e.type);
        }
    }
}
