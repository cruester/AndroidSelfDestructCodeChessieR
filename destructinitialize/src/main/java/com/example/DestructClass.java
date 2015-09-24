package com.example;

public class DestructClass {
    static public void main(String args[])
    {
        //This holds what would be user input
        String voiceRecog[] = {"Computer, this is Captain James Kirk of the U.S.S Enterprise",
                                "This is commander Spock, Science Officer",
                            "This is Lt. Commander Scott, Chief Engineering Officer of the U.S.S. Enterprise"};
        //This holds what the computer would compare the user input to
        final String VOICE_COMPARE[] = {"Computer, this is Captain James Kirk of the U.S.S Enterprise",
                                        "This is commander Spock, Science Officer",
                            "This is Lt. Commander Scott, Chief Engineering Officer of the U.S.S. Enterprise"};
        //This holds user code input
        String sequence[] = {"1 code 11A", "2 code 11A2B", "3 code 1A2B3"};
        //This holds what the computer compares user codes to
        final String SEQUENCE_COMPARE[] = {"1 code 11A", "2 code 11A2B", "3 code 1A2B3"};
        //This holds Kirk's final input
        String finalCountVoiceRecog = "This is Captain James Kirk of the U.S.S. Enterprise. Destruct sequence 000 Destruct 0";
        //This holds what Kirk's input should be to initiate destruction
        final String FINAL_COUNT_VOICE_COMPARE = "This is Captain James Kirk of the U.S.S. Enterprise. Destruct sequence 000 Destruct 0";
        //This is a dumb star that I decided to use because the bomb was being difficult
        char explosion = '\u2605';

        for (int i = 0; i < 3; i++) //Where the computer collects and analyzes crew's input
        {
            if ((voiceRecog[i]).equals(VOICE_COMPARE[i])) {
                System.out.println("Beep Boop Bop");
                if ((sequence[i]).equals(SEQUENCE_COMPARE[i]))
                    System.out.println("System code " + sequence[i] + " complete");
                else {
                    System.out.println("Invalid sequence");

                }
            } else
                System.out.println("Invalid voice recognition");
        }

        System.out.println("Destruct sequence completed and engaged. Awaiting final code for 30 second countdown");

        //Below is the counter that counts down
        if ((finalCountVoiceRecog).equals(FINAL_COUNT_VOICE_COMPARE))
        {
            for (int x = 30; x > 0; x--)
                System.out.println(x + " seconds");
        }
        else
        {
            System.out.println("Self Destruct Cancelled");
        }

        System.out.println(explosion + "COMPLETE" + explosion); //This is the lame explosion




    }

    }


