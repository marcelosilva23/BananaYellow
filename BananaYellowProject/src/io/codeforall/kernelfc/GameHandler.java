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
import java.security.Key;
import java.util.ArrayList;
import java.util.LinkedList;

public class GameHandler {
    static boolean isGameRunning = true;
    static int screenWidth = 1800;
    static int screenHeight = 1100;
    static int newPipeSpawnPosition = 900;
    static int pipeSpeed = 5;

    public static Picture fried = new Picture(275,720, "resources/fried.png");
    public static Picture pressR = new Picture(425,800, "resources/pressR.png");
    public static Picture coolchicken = new Picture(490,150, "resources/coolchicken.png");

    public static Bird bird = new Bird();
    public static MyLittkleKeyboardHandler kbh = new MyLittkleKeyboardHandler(bird);
    public static ArrayList<Pipe> arrayPipe = new ArrayList<>();
    public static Score score = new Score();



    public static void main(String[] args) throws InterruptedException, IOException {

        Sounds menuMusic = new Sounds("resources/menumusic.wav");
        Sounds gameMusic = new Sounds("resources/gamemusic.wav");
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

    public static void drawAll(){
        Picture background = new Picture(10, 0, "resources/background.png");
        //background.draw();

        bird.draw();

        for (Pipe pipe : arrayPipe) {
            pipe.move();
        }

        Score.drawScore();
    }

    public static void restart() throws IOException, InterruptedException {
        isGameRunning = false;
        Thread.sleep(500);

        bird.bird.delete();
        bird = new Bird();
        bird.draw();

        for (Pipe pipe : arrayPipe) {
            pipe.upPipe.delete();
            pipe.downPipe.delete();
        }

        arrayPipe.clear();
        arrayPipe.add(PipeFactory.pipeCreator());

        score.setScore(0);
        Score.drawScore();

        fried.delete();
        pressR.delete();
        coolchicken.delete();

        isGameRunning = true;
        bird.newBird();
        startGame();

    }

    public static void startGame() throws InterruptedException, IOException {
        System.out.println("gameStarted");
        while (isGameRunning) {
            drawAll();

            System.out.println("new iteration");
            // create and move for each pipe
            // if last pipe in array position X is < 900
            if (arrayPipe.get(arrayPipe.size() - 1).getX() < newPipeSpawnPosition) {
                // create pipe
                System.out.println("new pipe created");
                arrayPipe.add(PipeFactory.pipeCreator());
            }
            if (arrayPipe.get(0).getX() < -200) {
                System.out.println("pipe destroyed");
                // create pipe
                arrayPipe.remove(0);
            }
            // make the bird fall
            bird.fall();

            //for each pipe, move
            for (Pipe pipe : arrayPipe) {
                pipe.move();
            }
            System.out.println("pipes moved");
            //check colision
            if (ColisionHandler.isColliding(arrayPipe, bird)){
                bird.isDead = true;
                System.out.println("bird collided at Y " + bird.getY() + " acceleration " + bird.acceleration);
            }
            Thread.sleep(20);
        }
        // depois do loop, criar a chicken
        coolchicken.draw ();
        pressR.draw ();
        Picture fried;
        fried = new Picture(500, 370, "resources/youarefried.png");
        fried.draw ();

        SaveFileHandler.loadFile();
        SaveFileHandler.saveNew(score.getScore() + "");
        System.out.println(" game ended");
    }
}

