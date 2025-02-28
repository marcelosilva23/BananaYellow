package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;

public class ColisionHandler {
    public static int topLimit  = 0;
    public static int bottomLimit = 875;
    public static int imageThreshHold = 25;

    static Sounds deadChicken = new Sounds ("resources/deadchicken.wav");

    // automatic collision detection
    public static boolean checkColision(Picture obstacle, Bird bird){
        if(
                obstacle.getX() < bird.X + bird.getWidth() - imageThreshHold&&
                        obstacle.getX() + obstacle.getWidth() > bird.X + imageThreshHold&&
                        obstacle.getY() < bird.Y + bird.getHeight() - imageThreshHold &&
                        obstacle.getY() + obstacle.getHeight() > bird.Y + imageThreshHold ){
            return true;
        }
        return false;
    }
    // isColiding return if is colliding ? true : false
    public static boolean isColliding(ArrayList<Pipe> pipes, Bird bird){
        if (bird.isDead){return true;}
        // is hitting the top or bottom Limit?
        if (bird.Y < topLimit || bird.Y > bottomLimit){
            System.out.println("bird hit the limit");
            deadChicken.play();
            GameHandler.StopGame();

            return true;
        }

        // for each pipe in pipes
        for (Pipe pipe : pipes){
            Rectangle score = pipe.pipeScore;
            // if bird is colliding with current pipe
            if (
                    checkColision(pipe.upPipe, bird) || checkColision(pipe.downPipe, bird)
            ){
                // return true
                System.out.println("Bird hit a pipe");
                GameHandler.StopGame();
                return true;
            }

            else if (
                    // hit score
                    score.getX() < bird.X + bird.getWidth()&&
                score.getX() + score.getWidth() > bird.X &&
                            score.getY() < bird.Y + bird.getHeight() &&
                            score.getY() + score.getHeight() > bird.Y &&
                            !pipe.scored
            ){
                System.out.println("hit score");
                Score.add(1);
                Score.drawScore();

                pipe.scored = true;
                return false;
            }
        }
        // if bird is not colliding with any pipe, return false
        return false;
    }


}
