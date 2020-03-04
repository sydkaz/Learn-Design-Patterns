package structural.patterns.composite.ex1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Being> beings = Arrays.asList(new Being[]{
                new Dog("Rogger", 5, "Dog Food"),
                new Dog("Qiqi", 5, "Tbone"),
                new Cat("Casy", 3, "Catfood "),
                new Cat("Taylor", 6, "Fish"),
                new Snake("Bob", 4, "mouse"),
                new Bird("Tweety", 1, "grain")
        });
        beings.forEach(System.out::println);

        beings.get(0).setMove(new ItCantMove());
        beings.get(1).setMove(new ItCantMove());
        beings.get(2).setMove(new ItCantMove());
        beings.get(3).setMove(new ItCantMove());
        beings.get(4).setMove(new ItCantMove());
        beings.forEach(System.out::println);

    }
}
