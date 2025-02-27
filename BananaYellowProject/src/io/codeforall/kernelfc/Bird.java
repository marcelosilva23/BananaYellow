package io.codeforall.kernelfc;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Bird  implements KeyboardHandler {
    private Keyboard keyboard = new Keyboard(this);

    // handles gravity acceleratiion (to be implemented)
    public boolean isDead = false;
    public double gravity;
    public Picture bird;

    public final int jumpHeight = 50;
    public final int GRAVITY = 1;

    private boolean jumping = false;

    // starting X position
    public int startingPosition = 100;

    public int X = startingPosition;

    public int Y = 100;

    public Bird() {
        System.out.println(Y);
        bird = new Picture(startingPosition, Y, "resources/bird.png");

        bird.draw();
        createKeyboardEvents();
    }

    //do move, if falling not jumping, if jumping not falling

    public void fall() {
        bird.translate(0, GRAVITY);
        Y++;
        gravity++;
       /* while (!jumping || !isDead) {
            int gravity =*1.1;*/
    }

    // bird jumping logic
    public void  jump() {
        jumping = true;
        bird.translate(0, -jumpHeight);
        Y -= jumpHeight;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (isDead){return;}
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                jump();
                break;
        }
    }
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void createKeyboardEvents() {

        KeyboardEvent keyboardEventSpace = new KeyboardEvent();
        keyboardEventSpace.setKey(KeyboardEvent.KEY_SPACE);
        keyboardEventSpace.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventSpace);


    }

    //getters
    public int getWidth(){
        return bird.getWidth();
    }

    public int getHeight(){
        return bird.getHeight();
    }


}



