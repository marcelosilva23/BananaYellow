package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Pipe {

    double y;
    Picture upPipe;
    Picture downPipe;
    public Rectangle pipeScore;
    public int gap = 500;
    double startingX = 1450;

    public double X = startingX;

    public Pipe(double y) {
        this.y = y;
        upPipe = new Picture(startingX, y - gap, "resources/toppipe.png");
        downPipe = new Picture(startingX, y + gap, "resources/bottompipe.png");
        pipeScore = new Rectangle(startingX, y, 100, gap);

        upPipe.draw();
        downPipe.draw();

    }

    public void move() {
        upPipe.translate(-1, 0);
        downPipe.translate(-1, 0);
        pipeScore.translate(-1, 0);
        X--;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
