package behavioral.patterns.strategy.ex3.profiles;


import behavioral.patterns.strategy.ex3.states.State;

import java.util.ArrayList;
import java.util.List;

public abstract class Profile {
    List<State> states;

    Profile(){
        states = new ArrayList<>();
    }
    public void sentAlert(){
        for (State state: states) {
            state.print();
        }
    }

    public void addtoState(State state){
        states.add(state);
    }
}
