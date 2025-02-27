package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.graphics.Text;

public class Score {
    public static int score = 0;
    public static Text scoreImg;
    public static int dificultyMultiplier  = 100;
    public static int minDistanceBetweenPipes = 100;


    public Score() {
        scoreImg = new Text(50, 50, "0");
        scoreImg.grow(30,40);
    }

    public static void drawScore(){
        scoreImg.setText(score + "");
        scoreImg.draw();
    }


    // add score
    public static void add(int ammount) {
        score += ammount;

        int temp = GameHandler.pipeSpawnPosition + (ammount * dificultyMultiplier);
        if (temp < minDistanceBetweenPipes) {
            GameHandler.pipeSpawnPosition = temp;
            System.out.println("temp" + temp);
        }
    }

    public static void reset(){

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // public int score
    // draw score (text)





}
