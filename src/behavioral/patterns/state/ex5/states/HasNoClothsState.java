package behavioral.patterns.state.ex5.states;


import behavioral.patterns.state.ex5.WashingMachine;
import behavioral.patterns.state.ex5.WashingMachineActions;

public class HasNoClothsState implements WashingMachineActions {
    WashingMachine washingMachine;

    public HasNoClothsState(WashingMachine washingMachine) {
        this.washingMachine = washingMachine;
    }

    @Override
    public void turnOnMachine() {
        System.out.println("Cant turn on yet");
    }

    @Override
    public void turnOffMacthine() {
        System.out.println("Cant turn OFF as its already off");
    }

    @Override
    public void addCloths(int numberOfCloths) {
        System.out.println("Adding "+numberOfCloths+" Cloths...");
        washingMachine.setNumberOfCloths(numberOfCloths);
        washingMachine.setCurrentState(washingMachine.hasClothsBeenAdded());
    }

    @Override
    public void removeChothes(int numberOfCloths) {
        System.out.println("Cant Remove as no cloths");
    }
}
