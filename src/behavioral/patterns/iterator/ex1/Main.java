package behavioral.patterns.iterator.ex1;

public class Main {
    public static void main(String[] args){
        Cars cars = new Cars();

        for(Iterator iterator = cars.getIterator(); iterator.hasNext();){
            String car = (String) iterator.next();
            System.out.println(car);
        }
    }
}
