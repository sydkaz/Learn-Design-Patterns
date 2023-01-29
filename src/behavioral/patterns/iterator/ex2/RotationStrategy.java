package behavioral.patterns.iterator.ex2;

import java.util.function.BiFunction;

public interface RotationStrategy {
    int getValueOnIndex(int[] arr, int index, int numberOfRotations);

    static RotationStrategy leftRotateStrategy() {
        return ( arr, index, nr)->  (arr.length + index- nr) % arr.length;
    }

    static RotationStrategy rightRotateStrategy() {
        return ( arr,index, nr)-> (index+nr) % arr.length;
    }
}
