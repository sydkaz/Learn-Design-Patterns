package behavioral.patterns.state.ex3.states;

import behavioral.patterns.state.ex3.profiles.Profile;

public class Silent implements State {

    @Override
    public void addAction(Profile profile) {
        profile.addtoState(this);
    }

    @Override
    public void print() {
        System.out.println("Silent.....");
    }
}
