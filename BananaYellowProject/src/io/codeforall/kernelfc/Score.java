package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class Score {
    public static int score = 0;
    public static Text scoreImg;
    public static int dificultyMultiplier  = GameHandler.dificultyMultiplier;
    public static int minDistanceBetweenPipes = 100;


    public Score() {
        scoreImg = new Text(50, 50, "0");
        scoreImg.grow(30,40);
        scoreImg.setColor(Color.WHITE);
    }

    public static void drawScore(){
        scoreImg.setText(score + "");
        scoreImg.draw();
    }


    // add score
    public static void add(int ammount) {
        score += ammount;

        int temp = GameHandler.newPipeTrigger + (ammount * dificultyMultiplier);
        if (temp < minDistanceBetweenPipes) {
            GameHandler.newPipeTrigger = temp;
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
