package hmm.what.happened;

public class Goat implements Introducer, LegNumberer {

    @Override
    public void introduce(){
        String message = "Im goat, having " + getLegNumber() + " legs";
        System.out.println(message);
    }

    @Override
    public int getLegNumber(){
        return 5;
    }
}
