package behavioral.patterns.command.commandImpl;


import behavioral.patterns.command.Command;
import behavioral.patterns.command.Vehicle;

public class MoveLeftCommand implements Command {
    Vehicle vehicle;

    public MoveLeftCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.moveLeft();
    }

    @Override
    public void undo() {
        this.vehicle.undoMoveLeft();
    }
}
