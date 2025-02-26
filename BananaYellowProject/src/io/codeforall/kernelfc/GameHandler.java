package io.codeforall.kernelfc;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameHandler {
    /* public class GameHandler implements KeyboardHandler {


        private Keyboard keyboard;

        private ChickenSound chickenSound;

        Bird bird = new Bird();

        Picture bird;

        Picture background;

        Picture nugget;

        Picture pipe;

        Picture fireGround;

        public GameHandler() {
            this.keyboard = new Keyboard(this);

            background = new Picture();
            background.draw();

            bird = new Picture(30, 300, "resources/chicken.jpg");
            bird.draw();

            pipe = new Picture();
            pipe.draw();

            fireGround = new Picture();
            fireGround.draw();

            nugget = new Picture();
            nugget.draw();



            createKeyboardEvents();

            backgroundMusic = new backgroundMusic();
            background.playloop();

            //Quando o bird passa pelo pipe
            birdSound = new birdSound("resources/CHICKENS.WAV");
            birdSound.playloop();

            fireGroundSound = new fireGroundSound();
            fireGroundSound.playloop();

            nuggetSound = new nuggetSound();
            nuggetSound.playloop();

        }

        public void createKeyboardEvents() {

            KeyboardEvent keyboardEventSpace = new KeyboardEvent();
            keyboardEventSpace.setKey(KeyboardEvent.KEY_SPACE);
            keyboardEventSpace.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(keyboardEventSpace);

            KeyboardEvent keyboardEventRight = new KeyboardEvent();
            keyboardEventRight.setKey(KeyboardEvent.KEY_RIGHT);
            keyboardEventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(keyboardEventRight);

            KeyboardEvent keyboardEventLeft = new KeyboardEvent();
            keyboardEventLeft.setKey(KeyboardEvent.KEY_LEFT);
            keyboardEventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(keyboardEventLeft);

            KeyboardEvent keyboardEventUp = new KeyboardEvent();
            keyboardEventUp.setKey(KeyboardEvent.KEY_UP);
            keyboardEventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(keyboardEventUp);

            KeyboardEvent keyboardEventDown = new KeyboardEvent();
            keyboardEventDown.setKey(KeyboardEvent.KEY_DOWN);
            keyboardEventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(keyboardEventDown);


        }

        //ALTERAR MAIS TARDE
        @Override
        public void keyPressed(KeyboardEvent keyboardEvent) {
            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_LEFT:
                    chicken.translate(-10,0);
                    break;
                case KeyboardEvent.KEY_RIGHT:
                    chicken.translate(10,0);
                    break;
                case KeyboardEvent.KEY_UP:
                    chicken.translate(0,-10);
                    break;
                case KeyboardEvent.KEY_DOWN:
                    chicken.translate(0,10);
                    break;
                case KeyboardEvent.KEY_SPACE:
                    nugget.draw();
                    break;


            }


        }

        @Override
        public void keyReleased(KeyboardEvent keyboardEvent) {

        }
    }*/
}
