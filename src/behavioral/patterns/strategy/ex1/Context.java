package behavioral.patterns.strategy.ex1;

public class Context {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a,int b){
        return strategy.action(a,b);
    }

}
