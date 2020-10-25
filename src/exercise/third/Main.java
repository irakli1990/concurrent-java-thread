package exercise.third;

import exercise.third.singer.Singer;

public class Main {
    public static void main(String[] args) {

        Singer[] threads = new Singer[100];
        for (int i = 0; i < threads.length; ++i) {
            threads[i] = new Singer(i+1);
        }

        /**
         * Thread with start method
         */
        for (Thread t : threads) {
            t.start();
        }

    }
}
