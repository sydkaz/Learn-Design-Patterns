package behavioral.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class VehicleMover {
    List<Command> commands = new ArrayList<Command>();
    public void addMove(Command command){
        commands.add(command);
    }

    public void moveVehicle(){
        commands.forEach(x->{
            x.execute();
        });
    }
}
