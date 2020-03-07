package behavioral.patterns.state.ex5;


import behavioral.patterns.state.ex5.states.HasClothsState;
import behavioral.patterns.state.ex5.states.HasNoClothsState;
import behavioral.patterns.state.ex5.states.OffState;
import behavioral.patterns.state.ex5.states.OnState;

public class WashingMachine {
    /*
    * States
    * */
    WashingMachineActions onState;
    WashingMachineActions offState;
    WashingMachineActions hasCloths;
    WashingMachineActions hasNoCloths;

    WashingMachineActions currentState;

    int numberOfCloths;

    public int getNumberOfCloths() {
        return numberOfCloths;
    }

    public void setNumberOfCloths(int numberOfCloths) {
        this.numberOfCloths = numberOfCloths;
    }

    public WashingMachine() {
        onState = new OnState(this);
        offState = new OffState(this);
        hasCloths = new HasClothsState(this);
        hasNoCloths = new HasNoClothsState(this);
        numberOfCloths = 0;
        currentState = hasNoCloths;

    }

    public void setCurrentState(WashingMachineActions currentState) {
        this.currentState = currentState;
    }

    public void turnOnMachine(){
        currentState.turnOnMachine();
    }
    public void turnOffMachine(){
        currentState.turnOffMacthine();
    }
    public void addClothsInfMachine(int numberOfCloths){
        currentState.addCloths(numberOfCloths);
    }
    public void removeClothsInfMachine(int numberOfCloths){
        currentState.removeChothes(numberOfCloths);
    }


    public WashingMachineActions hasClothsBeenAdded(){
        return hasCloths;
    }
    public WashingMachineActions hasClothsBeenRemoved(){
        return hasNoCloths;
    }

    public WashingMachineActions hasMachineBeenTurnedOn(){
        return onState;
    }

    public WashingMachineActions hasMachineBeenTurnedOff(){
        return offState;
    }
}
