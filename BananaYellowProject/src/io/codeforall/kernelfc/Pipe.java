package io.codeforall.kernelfc;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class Pipe {

    double y;
    Picture upPipe;
    Picture downPipe;
    public Rectangle score;
    public int gap = 500;
    double startingPosition = 600;



    public Pipe(double y) {
        this.y = y;
        upPipe = new Picture(startingPosition, y-gap, "resources/toppipe.png");
        downPipe = new Picture(startingPosition, y+gap, "resources/bottompipe.png");
        score = new Rectangle(startingPosition, y, 100, gap);

        upPipe.draw();
        downPipe.draw();

    }


}
