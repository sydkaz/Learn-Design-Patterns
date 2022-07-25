package behavioral.patterns.strategy.ex3.states;


import behavioral.patterns.strategy.ex3.profiles.Profile;

public class Ring implements State {

    @Override
    public void addAction(Profile alertNotify) {
        alertNotify.addtoState(this);
    }

    @Override
    public void print() {
        System.out.println("Ringing.....");
    }
}
