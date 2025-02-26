package io.codeforall.kernelfc;

import java.util.ArrayList;

public class ColisionHandler {
    public static int topLimit  = 10;
    public static int bottomLimit = 1100;

    // isColiding return if is colliding ? true : false
    // todo: implement colision with score
    public static boolean isColliding(ArrayList<Pipe> pipes, Bird bird){
        // is hitting the top or bottom Limit?
        if (bird.Y < topLimit || bird.Y > bottomLimit){
            System.out.println("bird hit the limit");
            return true;
        }

        // for each pipe in pipes
        for (Pipe pipe : pipes){

            // if bird is colliding with current pipe
            if (
                    // if is coliding with the upper pipe
                    (pipe.upPipe.getX() < bird.X + bird.getWidth() &&
                    pipe.upPipe.getX() + pipe.upPipe.getWidth() > bird.X &&
                    pipe.upPipe.getY() < bird.Y + bird.getHeight() &&
                    pipe.upPipe.getY() + pipe.upPipe.getHeight() > bird.Y)

                        ||

                    // if is colliding with the lower pipe
                            (pipe.downPipe.getX() < bird.X + bird.getWidth() &&
                    pipe.downPipe.getX() + pipe.downPipe.getWidth() > bird.X &&
                    pipe.downPipe.getY() < bird.Y + bird.getHeight() &&
                    pipe.downPipe.getY() + pipe.downPipe.getHeight() > bird.Y)
            ){
                // return true
                System.out.println("Bird hit a pipe");
                return true;
            }
        }
        // if bird is not colliding with any pipe, return false
        return false;
    }


}
