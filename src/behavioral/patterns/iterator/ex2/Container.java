package behavioral.patterns.iterator.ex2;

enum Directions {
    LEFT,
    RIGHT
}

public interface Container {

    public Iterator getIterator(int[] array,int numberOfRotations, Directions direction);
}