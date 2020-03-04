package structural.patterns.composite.ex1;

public class Bird extends Being {
    public Bird(String name, int age, String favFood) {
        this.name = name;
        this.age = age;
        this.favFood = favFood;
        this.move =new ItFlys();
    }

    @Override
    public void say() {
        System.out.println("Chirp!");
    }

    @Override
    public void eat() {
        System.out.println("Like to eat "+favFood);
    }
}
