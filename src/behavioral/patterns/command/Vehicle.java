package behavioral.patterns.command;

public abstract class Vehicle {
    int fuel;
    int speed;
    Point position;
    public abstract void moveForward();
    public abstract void undoMoveForward();

    public abstract void moveLeft();
    public abstract void undoMoveLeft();

    public abstract void moveRight();
    public abstract void undoMoveRight();


    public abstract void moveBack();
    public abstract void undoMoveBack();

    void print(String action){
        System.out.printf("Performing %s, fuel: %d, Position: X:%d  Y:%d    \n",action,fuel,position.getX(),position.getY());
    }
}
