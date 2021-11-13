package hmm.what.happened;

public abstract class Animal {

    protected int numberOfLegs;

    public Animal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public abstract void sayWhoIam();
}
