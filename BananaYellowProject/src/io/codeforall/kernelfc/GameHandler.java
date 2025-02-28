package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

import javax.swing.plaf.PanelUI;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class GameHandler {
    static boolean isGameRunning = true;
    static int screenWidth = 1800;
    static int screenHeight = 1100;
    static int newPipeSpawnPosition = 900;
    static int pipeSpeed = 5;

    public static Bird bird = new Bird();
    public static MyLittkleKeyboardHandler kbh = new MyLittkleKeyboardHandler(bird);
    public static ArrayList<Pipe> arrayPipe = new ArrayList<>();
    public static Score score = new Score();



    public static void main(String[] args) throws InterruptedException, IOException {

        Picture background;
        Rectangle rect = new Rectangle(10, 10, screenWidth, screenHeight);
        rect.draw();
        // background adicionado mas as dimensoes estao erradas, temos de dar fix
        background = new Picture(10, 0, "resources/background.png");
        background.draw();
        bird.draw();
        // Math random do eixo Y no spawn das pipes.


        arrayPipe.add(PipeFactory.pipeCreator());

        // passar o while para metodo

        startGame();

    }
    public static void StopGame() {
        isGameRunning = false;
    }

    public static void restart() throws IOException, InterruptedException {
        System.out.println("restarted");
        bird.isDead = false;
        isGameRunning = true;
        bird.newBird();
        startGame();

    }

    public static void startGame() throws InterruptedException, IOException {
        System.out.println("gameStarted");
        isGameRunning = true;
        bird.isDead = false;
        while (isGameRunning) {
            // create and move for each pipe
            // if last pipe in array position X is < 900
            if (arrayPipe.get(arrayPipe.size() - 1).getX() < newPipeSpawnPosition) {
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
        // depois do loop, criar a chicken
        Picture coolchicken;
        coolchicken = new Picture(490,150, "resources/coolchicken.png");
        coolchicken.draw ();
        Picture pressR;
        pressR = new Picture(425,800, "resources/pressR.png");
        pressR.draw ();
        Picture fried;
        fried = new Picture(275,720, "resources/fried.png");
        fried.setColorAt(10000, new Color(255, 0,0));
        fried.draw ();

        SaveFileHandler.loadFile();
        SaveFileHandler.saveNew(score.getScore() + "");
        System.out.println(" game ended");
    }
}

