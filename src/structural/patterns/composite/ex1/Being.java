package structural.patterns.composite.ex1;

public abstract class Being {
    protected int age;
    protected String name;
    protected String favFood;
    protected Move move;

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public void say(){
        System.out.println("Saying something");
    }
    public void eat(){
        System.out.println("Eating something");
    }

    @Override
    public String toString() {
        return "Being{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", favFood='" + favFood + '\'' +
                ", move=" + move.modeOfMovement() +
                '}';
    }
}
