package hmm.what.happened;

public class Cat extends Animal {

    public Cat(int numberOfLegs) {
        super(numberOfLegs);
    }

    @Override
    public void sayWhoIam() {
        String message = "Im cat and i have " + numberOfLegs + " legs";
        System.out.println(message);
    }
}
