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
        String moodState = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",moodState);
    }

    @Test
    public void testAnyMood()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String moodState = moodAnalyzer.analyzeMood();
        Assert.assertEquals("HAPPY",moodState);
    }
}
