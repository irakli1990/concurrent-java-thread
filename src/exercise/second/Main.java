package exercise.second;

import exercise.second.singer.Singer;

public class Main {
    public static void main(String [] args) {
        Singer [] threads = new Singer[100];
        for (int i = 0; i < threads.length; ++i) {
            threads[i] = new Singer(i+1);
            if (i >= 1) {
                threads[i-1].setNext(threads[i]);
            }
        }
        for (Thread t : threads) {
            t.start();
        }
    }
}
