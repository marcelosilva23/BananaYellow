package io.codeforall.kernelfc;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Bird  implements KeyboardHandler {
    private Keyboard keyboard = new Keyboard(this);
    double gravity;
    Picture bird;

    private boolean isDead = false;

    private final static int SPEED = 1;

    private boolean jumping = false;

    double startingPosition = 100;

    public double X = startingPosition;

    double y;

    public Bird() {

        bird = new Picture(startingPosition, X, "resources/bird.png");

        bird.draw();
        createKeyboardEvents();
    }

    //fazer move, if falling not jumping, if jumping not falling

    public void fall() {
        bird.translate(0, +1);
        gravity++;
       /* while (!jumping || !isDead) {
            int gravity =*1.1;*/
    }

    public void  jump() {
        jumping = true;
        bird.translate(0, -100);
        y--;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
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
}
   /* public Bird (pos){
        this.pos = pos;
        this.isFried = isFried;
        //this.size = size;
        gravity();
        jump();
    }*/

        /*public boolean isDead () {
            return isDead;
        }

        public GridPosition getPos () {
            return pos;
        }


        inicialPos(x, y, )

        private boolean isDead () {
            if (pos.y = 10)
                isFried = true;
        }


        public void move () {
            gravity++;
            while (!jumping || !isFried)
                accelerate(currentDirection(), Bird.SPEED * 1.1);
        }

        public boolean jump getKEY_SPACE() {
            jumping = true;
            return pos = y++;
        }*/


