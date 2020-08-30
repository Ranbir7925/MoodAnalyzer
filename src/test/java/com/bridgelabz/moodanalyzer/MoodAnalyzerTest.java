package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest
{

    @Test
    public void testSadMood()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String moodSate = moodAnalyzer.analyzeMood("I am in Sad Mood");
        Assert.assertEquals("SAD",moodSate);

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
