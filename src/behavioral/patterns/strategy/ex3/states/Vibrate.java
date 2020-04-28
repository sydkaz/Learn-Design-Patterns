package behavioral.patterns.strategy.ex3.states;


import behavioral.patterns.strategy.ex3.profiles.Profile;

public class Vibrate implements State {
    @Override
    public void addAction(Profile profile) {
        profile.addtoState(this);
    }

    @Override
    public void print() {
        System.out.println("Vibrate.....");
    }
}
