package behavioral.patterns.command.commandImpl;


import behavioral.patterns.command.Command;
import behavioral.patterns.command.Vehicle;

public class MoveRightCommand implements Command {
    Vehicle vehicle;

    public MoveRightCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.moveRight();
    }

    @Override
    public void undo() {
        this.vehicle.undoMoveRight();
    }
}
