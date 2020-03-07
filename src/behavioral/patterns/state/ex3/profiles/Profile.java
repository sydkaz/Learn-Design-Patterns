package behavioral.patterns.state.ex3.profiles;

import behavioral.patterns.state.ex3.states.State;


import java.util.List;

public abstract class Profile {
    List<State> states;

    public void sentAlert(){
        for (State state: states) {
            state.print();
        }
    }

    public void addtoState(State state){
        states.add(state);
    }
}
