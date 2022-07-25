package behavioral.patterns.state.ex4.states;


import behavioral.patterns.state.ex4.WashingMachine;
import behavioral.patterns.state.ex4.WashingMachineActions;

public class HasClothsState implements WashingMachineActions {
    WashingMachine washingMachine;

    public HasClothsState(WashingMachine washingMachine) {
        this.washingMachine = washingMachine;
    }

    @Override
    public void turnOnMachine() {
        System.out.println("Turning On Machine now");
        washingMachine.setCurrentState(washingMachine.hasMachineBeenTurnedOn());
    }

    @Override
    public void turnOffMacthine() {
        System.out.println("Cant turn off maching as it already off");
    }

    @Override
    public void addCloths(int numberOfCloths) {
        System.out.println("Adding Cloths ");
        washingMachine.setNumberOfCloths(washingMachine.getNumberOfCloths()+numberOfCloths);
    }

    @Override
    public void removeChothes(int numberOfCloths) {
        System.out.println("Cant Remove Cloths from running Machine");
    }
}
