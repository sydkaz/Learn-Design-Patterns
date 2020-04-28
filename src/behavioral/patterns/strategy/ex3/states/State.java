package behavioral.patterns.strategy.ex3.states;

import behavioral.patterns.strategy.ex3.profiles.Profile;

public interface State {
    void addAction(Profile alertNotify);
    void print();
}
