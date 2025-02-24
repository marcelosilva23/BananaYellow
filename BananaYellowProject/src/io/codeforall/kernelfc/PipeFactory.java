package io.codeforall.kernelfc;

public class PipeFactory {
    //started working on PipeFactory 22/2/25


    //get speed from game
    int speed;
    int screenTop;
    int screenBottom;

    //returns pipes
    public void createPipe(){
        return new Pipe(-20, generateRandomPos(screenBottom, screenTop));
    }

    //returns object
    public void createObject(){

    }

    //generates random Y position
    public int generateRandomPos(int min, int max){
       int returnNum = min - 1;
        while (returnNum < min){
            returnNum = (int) (Math.random() * max);
        }
        return returnNum;

    }

    //create pipe pair with proper positioning
    public void createPairPipe(int gap, Pipe pipe){

    }
}
