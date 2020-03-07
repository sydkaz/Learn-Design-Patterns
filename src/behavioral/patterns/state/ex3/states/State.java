package behavioral.patterns.state.ex3.states;


import behavioral.patterns.state.ex3.profiles.Profile;

public interface State {
    void addAction(Profile alertNotify);
    void print();
}
