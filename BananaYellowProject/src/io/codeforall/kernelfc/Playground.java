package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Playground {
    public static void main(String[] args) throws InterruptedException {

        Rectangle rect = new Rectangle(10, 10, 1500, 1100);
        rect.draw();


        Pipe pipe = new Pipe(100);
        Bird bird = new Bird(50)

        while (pipe.X > -1000) {
                bird.move();
                pipe.move();
                Thread.sleep(10);
        }
    }
}