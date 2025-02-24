package io.codeforall.kernelfc;

public class Bird {

    private GridPosition pos;

    private boolean isFried = false;

    private int size;

    private Grid grid;

    private final static int SPEED = 1;

    private int moves = 0;

    private boolean jumping = false;





    protected CollisionDetector collisionDetector;

    protected GridDirection currentDirection;



    public Bird (GridPosition pos){
        this.pos = pos;
        this.isFried = isFried;
        //this.size = size;
        gravity();
        jump();
    }

    public void setGrid (Grid grid){
        this.grid = grid;
    }

    public GridPosition getPos() {
        return pos;
    }

    public void setCollisionDetector(CollisionDetector collisionDetector){
        this.collisionDetector = collisionDetector;
    }

    //inicialPos(x, y,)

    private boolean isFried(){
        if (pos.y = 10)
        isFried = true;
    }


    public void move(){
        moves++;
        while (!jumping || !isFried)
        accelerate(currentDirection(), Bird.SPEED * 1.1);
    }

    public boolean jump getKEY_SPACE() {
       jumping = true;
       return pos = y++;
    }


}
