package hmm.what.happened;

public class Goat extends Animal {
    public Goat(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void sayWhoIam(){
        String message = "Im goat, having " + numberOfLegs + " legs";
        System.out.println(message);
    }
}
