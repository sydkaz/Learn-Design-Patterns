package behavioral.patterns.command.commandImpl;


import behavioral.patterns.command.Command;
import behavioral.patterns.command.Vehicle;

public class MoveForwardCommand implements Command {
    Vehicle vehicle;

    public MoveForwardCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.moveForward();
    }

    @Override
    public void undo() {
        this.vehicle.undoMoveForward();
    }
}
