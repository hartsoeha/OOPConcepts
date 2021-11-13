package hmm.what.happened;

public class Cat implements Introducer, LegNumberer {

    @Override
    public void introduce() {
        String message = "Im cat and i have " + getLegNumber() + " legs";
        System.out.println(message);
    }

    @Override
    public int getLegNumber() {
        return 4;
    }
}
