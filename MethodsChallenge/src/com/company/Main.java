package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int Score = 50;
        int levelCompleted = 1;
        int bonus = 100;

//        calculateHighscorePosition ( Score );
//        System.out.println ( calculateHighscorePosition ( Score ) );


        int highscore = calculateScore ( gameOver, Score, levelCompleted, bonus );
        System.out.println ( "Your final score was " + highscore );

        calculateHighscorePosition ( highscore );
        System.out.println ( calculateHighscorePosition ( highscore ) );

        displayHighScorePosition ( calculateHighscorePosition (highscore));

        Score = 400;
        levelCompleted = 2;
        bonus = 200;

        highscore = calculateScore ( gameOver, Score, levelCompleted, bonus );
        System.out.println ( "Your final score was " + highscore );

        //calculateHighscorePosition ( highscore );

        calculateHighscorePosition ( highscore );
        System.out.println ( calculateHighscorePosition ( highscore ) );

        displayHighScorePosition ( calculateHighscorePosition (highscore));

        Score = 900;
        levelCompleted = 3;
        bonus = 200;

        highscore = calculateScore ( gameOver, Score, levelCompleted, bonus );
        System.out.println ( "Your final score was " + highscore );

        calculateHighscorePosition ( highscore );
        System.out.println ( calculateHighscorePosition ( highscore ) );

        displayHighScorePosition ( calculateHighscorePosition (highscore));

        Score = 1500;
        levelCompleted = 2;
        bonus = 200;

        highscore = calculateScore ( gameOver, Score, levelCompleted, bonus );
        System.out.println ( "Your final score was " + highscore );

        calculateHighscorePosition ( highscore );
        System.out.println ( calculateHighscorePosition ( highscore ) );

        displayHighScorePosition ( calculateHighscorePosition (highscore));

        // Below is the way Tim called for the methods:

        int highScorePosition = calculateHighScorePosition ( 1500 );
        displayHighScorePosition2 ("Daniel", highScorePosition);

        highScorePosition = calculateHighScorePosition ( 900 );
        displayHighScorePosition2 ("Gogu", highScorePosition);

        highScorePosition = calculateHighScorePosition ( 400 );
        displayHighScorePosition2 ("Percival", highScorePosition);

        highScorePosition = calculateHighScorePosition ( 50 );
        displayHighScorePosition2 ("Ma-ta", highScorePosition);


    }

    public static int calculateScore(boolean gameOver, int Score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = Score + (levelCompleted * bonus);


            return finalScore;
        }
        return -1;
    }


    public static int calculateHighscorePosition(int highscore) {
        if (highscore >= 1000) {
            return 1;
        } else if ((highscore >= 500) && (highscore < 1000)) {
            return 2;
        } else if ((highscore >= 100) && (highscore < 500)) {
            return 3;
        }
        return 4;
    }


    public static int displayHighScorePosition(int calculateHighscorePosition) {

        String Name = "Daniel";
        int PlayerPosition = calculateHighscorePosition;
        System.out.println ( Name + " managed to get into position: " + PlayerPosition + " !" );
        return PlayerPosition;

    }

    //Below we have the way Tim wrote the methods (fucking EYYYYYY):




    public static void displayHighScorePosition2(String playerName, int highScorePosition) {
        System.out.println (playerName + " managed to get into position " + highScorePosition + " on the high score table!");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000){
            return 1;
        } else if ( playerScore >= 500) {return 2;}
        else if (playerScore >= 100) {return 3;}
        else {return 4;}
    }

}






