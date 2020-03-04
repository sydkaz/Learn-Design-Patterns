package structural.patterns.composite.ex1;

public class Cat extends Being {
    public Cat(String name, int age, String favFood) {
        this.name = name;
        this.age = age;
        this.favFood = favFood;this.move =new ItRuns();
    }

    @Override
    public void say() {
        System.out.println("Meoww!");
    }

    @Override
    public void eat() {
        System.out.println("Like catfood ! ");
    }
}
