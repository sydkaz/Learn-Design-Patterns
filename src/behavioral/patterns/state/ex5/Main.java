package behavioral.patterns.state.ex5;

public class Main {
    public static void main(String[] args){
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.addClothsInfMachine(2);
        washingMachine.turnOnMachine();
        washingMachine.addClothsInfMachine(1);
        washingMachine.removeClothsInfMachine(2);
        washingMachine.turnOnMachine();
        washingMachine.turnOffMachine();
        washingMachine.turnOffMachine();
        washingMachine.addClothsInfMachine(2);
        washingMachine.removeClothsInfMachine(2);
    }
}
