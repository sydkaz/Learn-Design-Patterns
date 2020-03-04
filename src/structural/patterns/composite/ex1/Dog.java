package structural.patterns.composite.ex1;

public class Dog extends Being {
    public Dog(String name,int age,String favFood) {
        this.name = name;
        this.age = age;
        this.favFood = favFood;
        this.move =new ItRuns();
    }

    @Override
    public void say() {
        System.out.println("Woof Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Like to eat "+favFood);
    }
}
