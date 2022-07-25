package behavioral.patterns.state.ex4.states;

import behavioral.patterns.state.ex4.WashingMachine;
import behavioral.patterns.state.ex4.WashingMachineActions;

public class OnState  implements WashingMachineActions {
    WashingMachine washingMachine;

    public OnState(WashingMachine washingMachine) {
        this.washingMachine = washingMachine;
    }

    @Override
    public void turnOnMachine() {
        System.out.println("Cant turn on as its already on");
    }

    @Override
    public void turnOffMacthine() {
        System.out.println("Stopping Machine now ");
        washingMachine.setCurrentState(washingMachine.hasMachineBeenTurnedOff());
    }

    @Override
    public void addCloths(int numberOfCloths) {
        System.out.println("Adding more cloths while running ");
        washingMachine.setNumberOfCloths(washingMachine.getNumberOfCloths()+numberOfCloths);
    }

    @Override
    public void removeChothes(int numberOfCloths) {
        System.out.println("Cant Remove Cloths from running Machine");
    }
}
