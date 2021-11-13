package hmm.what.application;

import hmm.what.happened.Cat;
import hmm.what.happened.Goat;
import hmm.what.happened.Introducer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Introducer goat = new Goat();
        Introducer cat = new Cat();

        List<Introducer> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(goat);
        listOfAnimals.add(cat);
        for (Introducer listOfAnimal : listOfAnimals) {
            listOfAnimal.introduce();
        }
    }
}

