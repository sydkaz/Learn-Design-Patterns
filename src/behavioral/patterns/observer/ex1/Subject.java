package ex1;

public interface Subject {
    void register(Observer o);
    void deregister(Observer o);
    void notifyAllObservers();
}
