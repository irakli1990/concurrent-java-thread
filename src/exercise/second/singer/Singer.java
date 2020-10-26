package exercise.second.singer;

/**
 * @author Irakli Kardava
 * Singer is not drunk yet
 * Let’s assume that the threads from Exercise 1 are connected in a list, so that a thread with N=i directly precedes the thread with N=i+1.
 * This can be achieved with adding Singer next private field to Singer class which can be set with an additional public void setNext(Singer next) { this.next = next; } method.
 * Try to modify the run() method of the threads so that the lyrics of the song are printed in order, i.e. starting at 99 down to 0.
 *
 * The structure of the main() method in this case should resemble the following
 * @see exercise.second.Main
 */
public class Singer extends Thread {
    private final int bottleCount;
    private Singer next;

    public Singer(int bottleCount) {
        this.bottleCount = bottleCount;
    }


    @Override
    public void run() {
        try {
            if (next != null) {
                next.join();
                System.out.printf("%s bottles of beer on the wall, %s bottles of beer%n", bottleCount, bottleCount);
                System.out.printf("take one down and pass it around, %s bottles of beer on the wall%n", (bottleCount - 1));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void setNext(Singer next) {
        this.next = next;
    }
}
