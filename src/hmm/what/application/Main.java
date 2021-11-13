package hmm.what.application;

import hmm.what.happened.Animal;
import hmm.what.happened.Cat;
import hmm.what.happened.Goat;

public class Main {
    public static void main(String[] args) {
        Animal goat = new Goat(4);
        Animal cat = new Cat(100);
        cat.sayWhoIam();
        goat.sayWhoIam();
    }
}
