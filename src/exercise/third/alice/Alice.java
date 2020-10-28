package exercise.third.alice;

import exercise.third.bob.Bob;

/**@see Bob
 * Alice in her run() method executes a for loop in which she sends a number to Bob using his setInput() method and then waits for 1 second.
 * The loop is stopped after sending numbers from 1 to 10. At the end, Alice sends to Bob a value 0 denoting the end of the computations.
 */
public class Alice extends Thread {
    private String TAG = "[Alice]";
    private Bob bob;

    public Alice(Bob bob) {
        this.bob = bob;
    }

    @Override
    public  void run() {
        this.setName(TAG);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%s Sending to Bob: %s%n", TAG, i);
                this.bob.setInput(i);
                Thread.sleep(1000);
                this.bob.run();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        this.bob.interrupt();
    }
}
