package io.codeforall.kernelfc;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Bird {
    // handles gravity acceleratiion (to be implemented)
    public int acceleration;
    public boolean isDead = false;
    public Picture bird;

    public final int jumpHeight = 12;
    public final int GRAVITY = 100;

    // starting X position
    public int startingPosition = 100;

    public int X = startingPosition;

    public int Y = 100;

    public Bird() {
        bird = new Picture(startingPosition, Y, "resources/bird.png");
    }

    public void newBird(){
        bird = new Picture(startingPosition, 100, "resources/bird.png");
        Y = 100;
        acceleration = 0;
        bird.draw();
    }

    //do move, if falling not jumping, if jumping not falling

    public void fall() {
        if (acceleration < GRAVITY) {
            acceleration++;
        }
        bird.translate(0, acceleration);
        Y = bird.getY();
       /* while (!jumping || !isDead) {
            int gravity =*1.1;*/
    }

    // bird jumping logic
    public void  jump() {
        acceleration = -jumpHeight;

    }


    //getters
    public int getWidth(){
        return bird.getWidth();
    }

    public int getHeight(){
        return bird.getHeight();
    }


    public void draw() {
        bird.draw();
    }

    public void move(int x, int y){
        bird.translate(x, y);
        this.Y += y;
        this.X += x;
    }
}



