package behavioral.patterns.nativeobserver;


import java.util.Observable;
import java.util.Observer;

class A implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("A:" + arg);
    }
}
class B{
    C c;
    public B(A a) {
        c =new C();
        c.addObserver(a);
    }
    public void setState(String newState){
        c.notifyAllObservers(newState);
    }
}
class C extends Observable{
    public void notifyAllObservers(Object o){
        setChanged();
        notifyObservers(o);
    }
}



public class Main {
    public static void main(String[] args){
        A a =new A();
        B b = new B(a);
        b.setState("Test Data 1");
        b.setState("Test Data 2");
        b.setState("Test Data 3");
    }
}
