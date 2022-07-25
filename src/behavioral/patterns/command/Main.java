package behavioral.patterns.command;

import behavioral.patterns.command.Car;
import behavioral.patterns.command.VehicleMover;
import behavioral.patterns.command.commandImpl.MoveForwardCommand;
import behavioral.patterns.command.commandImpl.MoveRightCommand;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Car car =new Car();
        VehicleMover vehicleMover = new VehicleMover();
        Command command = new MoveForwardCommand(car);
        Command command1 = new MoveRightCommand(car);
        Command command2 = new MoveRightCommand(car);
        Command command3 = new MoveRightCommand(car);

        vehicleMover.addMove(command);
        vehicleMover.addMove(command1);
        vehicleMover.addMove(command2);
        vehicleMover.addMove(command3);

        vehicleMover.moveVehicle();
    }
}
