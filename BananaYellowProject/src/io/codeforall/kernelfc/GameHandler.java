package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

import java.util.ArrayList;

public class GameHandler {
    static boolean isGameRunning = true;
    static int screenWidth = 1500;
    static int screenHeight = 1100;
    static int pipeSpawnPosition = 1000;
    static int pipeSpeed = 5;

    public static void main(String[] args) throws InterruptedException {

        Picture background;
        Rectangle rect = new Rectangle(10, 10, screenWidth, screenHeight);
        rect.draw();
        Score score = new Score();
        // background adicionado mas as dimensoes estao erradas, temos de dar fix
        background = new Picture(10, 0, "resources/background.png");
        background.draw();
        // Math random do eixo Y no spawn das pipes.

        Bird bird = new Bird();
        GameHandler game = new GameHandler();

        ArrayList<Pipe> arrayPipe = new ArrayList<>();
        arrayPipe.add(PipeFactory.pipeCreator());

        while (isGameRunning) {
            // create and move for each pipe
            // if last pipe in array position X is < 900
            if (arrayPipe.get(arrayPipe.size() - 1).getX() < pipeSpawnPosition) {
                // create pipe
                arrayPipe.add(PipeFactory.pipeCreator());
            }
            if (arrayPipe.get(0).getX() < -200) {
                // create pipe
                arrayPipe.remove(0);
            }
            // make the bird fall
            bird.fall();

            //for each pipe, move
            for (Pipe pipe : arrayPipe) {
                pipe.move();
            }
            //check colision
            if (ColisionHandler.isColliding(arrayPipe, bird)){
                bird.isDead = true;
            }
            Thread.sleep(20);
        }

    }

    public static void StopGame() {
        isGameRunning = false;
    }
}

