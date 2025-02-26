package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

import java.util.ArrayList;

public class Playground {
    public static void main(String[] args) throws InterruptedException {

        Picture background;
        Rectangle rect = new Rectangle(10, 10, 1500, 1100);
        rect.draw();
       // background adicionado mas as dimensoes estao erradas, temos de dar fix
        background = new Picture(10, 0, "resources/background.png");
        background.draw();
        // Math random do eixo Y no spawn das pipes.

        Bird bird = new Bird();
GameHandler game = new GameHandler();

ArrayList<Pipe> arrayPipe = new ArrayList<>();
        arrayPipe.add(PipeFactory.pipeCreator());

        while (true) {

if(arrayPipe.get(arrayPipe.size()-1).getX() < 900){
    arrayPipe.add(PipeFactory.pipeCreator());
}
            bird.fall();
            for (Pipe pipe : arrayPipe){
                pipe.move();
            }
            ColisionHandler.isColliding(arrayPipe, bird);
            Thread.sleep(12);
        }

    }

}

