package behavioral.patterns.strategy.ex1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Strategy> strategies = Arrays.asList(new Strategy[]{
            new Add(),
                    new Subract(),
                    new Multiply(),
                    new Divide(),

        });
        Context context = new Context();
        strategies.forEach(x->{
         context.setStrategy(x);
         System.out.println(context.executeStrategy(3,5));
        });



    }
}
