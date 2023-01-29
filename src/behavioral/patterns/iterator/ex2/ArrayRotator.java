package behavioral.patterns.iterator.ex2;


public class ArrayRotator implements Container {
    public int nums[] ;

    @Override
    public Iterator getIterator(int[] array,int numberOfRotations, Directions direction) {
        nums = array;
        return new ArrayIterator(numberOfRotations,direction);
    }

    private class ArrayIterator implements Iterator {

        int index;
        int numberOfRotations;
        Directions direction;

        public ArrayIterator(int numberOfRotations, Directions direction) {
            this.numberOfRotations = numberOfRotations;
            this.direction = direction;
        }

        @Override
        public boolean hasNext() {
            if(index < nums.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                if(direction == Directions.RIGHT) {
                    RotationStrategy rotationStrategy = RotationStrategy.rightRotateStrategy();
                   return nums[rotationStrategy.getValueOnIndex(nums,index++,numberOfRotations)];
                }
                else if(direction == Directions.LEFT) {
                    RotationStrategy rotationStrategy = RotationStrategy.leftRotateStrategy();
                    return nums[rotationStrategy.getValueOnIndex(nums,index++,numberOfRotations)];
                }
                else
                    throw new RuntimeException("Direction is not defined!");
            }
            return null;
        }
    }
}