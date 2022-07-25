package behavioral.patterns.command.commandImpl;


import behavioral.patterns.command.Command;
import behavioral.patterns.command.Vehicle;

public class MoveBackwardCommand implements Command {
    Vehicle vehicle;

    public MoveBackwardCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.moveBack();
    }

    @Override
    public void undo() {
        this.vehicle.undoMoveBack();
    }
}
