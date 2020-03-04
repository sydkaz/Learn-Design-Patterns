package structural.patterns.composite.ex1;

public class ItCantMove implements Move {
    @Override
    public String modeOfMovement() {
        return "Cant move at all!";
    }
}
