package exercise.first.singer;


/**
 * @author Irakli Kardava
 * Singer who is really drunk
 * and sings song with messed up
 */
public class Singer extends Thread {
    private final int bottleCount;

    public Singer(int bottleCount) {
        this.bottleCount = bottleCount;
    }

    @Override
    public void run() {
        System.out.printf("%s bottles of beer on the wall, %s bottles of beer%n", bottleCount, bottleCount);
        System.out.printf("take one down and pass it around, %s bottles of beer on the wall%n", bottleCount - 1);
    }

}
