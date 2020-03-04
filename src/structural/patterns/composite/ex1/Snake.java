package structural.patterns.composite.ex1;

public class Snake extends Being {
    public Snake(String name, int age, String favFood) {
        this.name = name;
        this.age = age;
        this.favFood = favFood;
        this.move =new ItSlithers();
    }

    @Override
    public void say() {
        System.out.println("Hiss!");
    }

    @Override
    public void eat() {
        System.out.println("Like to eat "+favFood);
    }
}
