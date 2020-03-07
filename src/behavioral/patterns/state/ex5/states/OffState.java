package behavioral.patterns.state.ex5.states;


import behavioral.patterns.state.ex5.WashingMachine;
import behavioral.patterns.state.ex5.WashingMachineActions;

public class OffState implements WashingMachineActions {
    WashingMachine washingMachine;

    public OffState(WashingMachine washingMachine) {
        this.washingMachine = washingMachine;
    }

    @Override
    public void turnOnMachine() {
        System.out.println("Turnung on Again ");
        washingMachine.setCurrentState(washingMachine.hasClothsBeenRemoved());
    }

    @Override
    public void turnOffMacthine() {
        System.out.println("Cant turn off as its already off ");
    }

    @Override
    public void addCloths(int numberOfCloths) {
        System.out.println("Remove exisitng cloths first");
    }

    @Override
    public void removeChothes(int numberOfCloths) {
        System.out.println("Removing  "+numberOfCloths+" Cloths...");
        washingMachine.setCurrentState(washingMachine.hasClothsBeenRemoved());
    }
}
