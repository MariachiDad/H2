package H02Q4;

//Code from interfaces-section-06
//AUTHOR: Kevin R. Burger (burgerk@asu.edu)
//Edited by Chris D'Amore (cdamore1@asu.edu)

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        ArrayList<MakesSound> critters = new ArrayList<>();
        critters.add(new Bee());
        critters.add(new Frog());
        critters.add(new Bee());
        critters.add(new Frog());
        critters.add(new Frog());
        sounds(critters);
    }

    public void sounds(ArrayList<MakesSound> pCritters) {
    	for (MakesSound critter : pCritters) {
            critter.makeSound();
        }
    }
}
