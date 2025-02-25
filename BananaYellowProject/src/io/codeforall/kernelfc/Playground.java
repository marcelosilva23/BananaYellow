package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

public class Playground {
    public static void main(String[] args) throws InterruptedException {

        Rectangle rect = new Rectangle(10, 10, 1500, 1100);
        rect.draw();


        Pipe pipe = new Pipe(100);
        Bird bird = new Bird();


        while (pipe.X > -1000) {
            pipe.move();
            bird.fall();

            Thread.sleep(10);
        }

    }

}

