package behavioral.patterns.iterator.ex1;

public class Cars implements Container{
    String[] cars = new String[]{"Hona","Toyota","Mazda","Suzuki","Audi","Subaru","Mitsubishi","BMW"};

    @Override
    public Iterator getIterator() {
        return new CarsIterator();
    }

    private class CarsIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            return index < cars.length;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return cars[index++];
            else
                return null;
        }
    }

}
