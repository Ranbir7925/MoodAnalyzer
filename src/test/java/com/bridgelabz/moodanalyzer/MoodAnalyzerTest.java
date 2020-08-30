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
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String moodState = moodAnalyzer.analyzeMood("I am in Happy Mood");
        Assert.assertEquals("HAPPY",moodState);
    }

    @Test
    public void testAnyMood()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String moodState = moodAnalyzer.analyzeMood("I am in Any Mood");
        Assert.assertEquals("HAPPY",moodState);
    }
}
