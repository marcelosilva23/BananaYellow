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

        Picture background;
        Rectangle rect = new Rectangle(10, 10, 1500, 1100);
        rect.draw();
       // background adicionado mas as dimensoes estao erradas, temos de dar fix
        background = new Picture(10, 0, "resources/background.png");
        background.draw();
        // Math random do eixo Y no spawn das pipes, a transferir para o pipeFactory ( esta la comentado)
        int yMax = 500;
        int yMin = -250;
       Pipe pipe = new Pipe(Math.random() * (yMax - yMin) + yMin);
        Bird bird = new Bird();


        while (pipe.X > -1000) {
            pipe.move();
            bird.fall();

            Thread.sleep(10);
        }

    }

}

