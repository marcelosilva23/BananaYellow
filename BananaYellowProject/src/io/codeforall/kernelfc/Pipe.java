package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Pipe {

    double y;
    Picture upPipe;
    Picture downPipe;
    // invisible score rectangle
    public Rectangle pipeScore;

    //gap between the top and bottom pipe, score´s height
    public int gap = 500;
    // tracks the groups X position
    public double X = 1450;

    // initiate bottom pipe, top pipe and invisible score rectangle
    // Y parameter to be randomized by the pipe factory
    public Pipe(double y) {
        this.y = y;
        upPipe = new Picture(X, y - gap, "resources/toppipe.png");
        downPipe = new Picture(X, y + gap, "resources/bottompipe.png");
        pipeScore = new Rectangle(X, y, 100, gap);

        upPipe.draw();
        downPipe.draw();

    }

    // moves the pipe group 1px to the left, used for the automove of the pipes
    public void move() {
        upPipe.translate(-1, 0);
        downPipe.translate(-1, 0);
        pipeScore.translate(-1, 0);
        X--;
    }

    //getters / setters
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getGap() {
        return gap;
    }

    public void setGap(int gap) {
        this.gap = gap;
    }

}
