package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Bird {

    double y;

    private boolean isDead = false;

    private final static int SPEED = 1;

    private boolean jumping = false;

    double startingPosition = 100;

    public double X = startingPosition;

    public Bird bird(double y) {
        this.y = y;
        new Picture(startingPosition, y - gap, "resources/toppipe.png");

        upPipe.draw();
        downPipe.draw();


   /* public Bird (pos){
        this.pos = pos;
        this.isFried = isFried;
        //this.size = size;
        gravity();
        jump();
    }*/

        public boolean isDead () {
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
        }


    }
