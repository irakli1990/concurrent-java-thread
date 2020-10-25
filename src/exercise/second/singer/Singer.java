package exercise.second.singer;

/**
 * @author Irakli Kardava
 * Singer is not drunk yet
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
