package behavioral.patterns.command;

public class Car extends Vehicle {

    public Car() {
        this.fuel = 100;
        speed = 1;
        position = new Point();
    }

    @Override
    public void moveRight() {
        position.setX(position.getX()+speed);
        print("moveRight");
    }

    @Override
    public void undoMoveRight() {
        position.setX(position.getX()-speed);
        print("undoMoveRight");
    }

    @Override
    public void moveBack() {
        position.setY(position.getY()-speed);
        print("moveBack");
    }

    @Override
    public void undoMoveBack() {
        position.setY(position.getY()+speed);
        print("undoMoveBack");
    }

    @Override
    public void moveForward(){
        position.setY(position.getY()+speed);
        print("moveForward");
    }

    @Override
    public void undoMoveForward(){
        position.setY(position.getY()-speed);
        print("undoMoveForward");
    }

    @Override
    public void moveLeft(){
        position.setX(position.getX()-speed);
        print("moveLeft");
    }

    @Override
    public void undoMoveLeft(){
        position.setX(position.getX()+speed);
        print("undoMoveLeft");
    }
}
