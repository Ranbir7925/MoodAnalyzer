package com.bridgelabz.moodanalyzer;
public class MoodAnalyzer
{
    String message;

    MoodAnalyzer(){}
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood()
    {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
    
}
