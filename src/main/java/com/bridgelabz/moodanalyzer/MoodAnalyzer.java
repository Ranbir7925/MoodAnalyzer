package com.bridgelabz.moodanalyzer;
public class MoodAnalyzer
{
    public String analyzeMood(String moodMessage)
    {
        if (moodMessage.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
    
}