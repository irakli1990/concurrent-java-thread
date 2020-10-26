package exercise.first.singer;


/**
 * @author Irakli Kardava
 * Singer who is really drunk
 * and sings song with messed up
 *
 * Write a concurrent program which prints to the console lyrics of “99 Bottles of Beer” song which is an anonymous folk song popular in some countries. The lyrics are as follows:
 *
 * 100 bottles of beer on the wall, 100 bottles of beer
 * Take one down and pass it around, 99 bottles of beer on the wall
 * 99 bottles of beer on the wall, 99 bottles of beer
 * Take one down and pass it around, 98 bottles of beer on the wall
 * ...
 * 1 bottles of beer on the wall, 1 bottles of beer
 * Take one down and pass it around, 0 bottles of beer on the wall
 * The lyrics have to be printed by concurrent threads each of which is responsible for printing two lines:
 * The lyrics have to be printed by concurrent threads each of which is responsible for printing two lines:
 *
 * N bottles of beer on the wall, N bottles of beer
 * Take one down and pass it around, N-1 bottles of beer on the wall
 * where N is a number assigned to that thread. Threads should be implemented by Singer class inheriting from Thread and receiving in its constructor the value of N.
 * The threads are created and started at approximately the same time in the main() method similar to the following:
 * @see exercise.first.Main
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
