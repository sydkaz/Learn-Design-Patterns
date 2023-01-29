package behavioral.patterns.iterator.ex2;

public class Main {
    public static void main(String[] args) {
        ArrayRotator namesRepository = new ArrayRotator();

        for(Iterator iter = namesRepository.getIterator(new int[]{1,3,4,5,6,7},2, Directions.RIGHT); iter.hasNext();){
            Integer name = (int)iter.next();
            System.out.println(Directions.RIGHT +" Elem : " + name);
        }

        for(Iterator iter = namesRepository.getIterator(new int[]{1,3,4,5,6,7},2, Directions.LEFT); iter.hasNext();){
            Integer name = (int)iter.next();
            System.out.println(Directions.LEFT+" Elem : " + name);
        }
    }
}
