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
}
