package exercise.third;

import exercise.third.alice.Alice;
import exercise.third.bob.Bob;

public class Main {
    public static void main(String[] args) {
        Bob bob = new Bob();
        Alice alice = new Alice(bob);
        bob.start();
        alice.start();
    }
}
