package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.graphics.Text;

public class Score {
    public static int score = 0;
    public static Text scoreImg;


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
        System.out.println(score);
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
