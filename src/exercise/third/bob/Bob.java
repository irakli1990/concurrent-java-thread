package exercise.third.bob;


/**
 * Write a program in which a pair of threads implemented by classes Alice and Bob are interacting with each other.
 * <p>
 * Bob has a method setInput(int x) which sets a value of his internal variable (field) named input.
 * In his run() method Bob executes an infinite loop in which he repeatedly checks the state of his interruption flag. Upon interruption he reads value of his input field and:
 * prints a goodbye message and stops if the value is 0;
 * prints a doubled value of input and continues.
 *
 * @see exercise.third.alice.Alice
 * Hint. Bob should check his interruption flag using interrupted() method instead of isInterrupted() as the former also clears the flag.
 * <p>
 * Please, check how the program’s output changes if Alice does not wait after sending a number to Bob.
 */
public class Bob extends Thread {
    private static final String TAG = "[Bob]";
    private int input;
    boolean flag;


    public void setInput(int input) {
        this.input = input;
    }


    @Override
    public void run() {
        this.flag = !Thread.interrupted();
        if (this.input != 0 ) {
            while (flag) {
                System.out.printf("%s The result is: %s%n", TAG, this.input *= 2);
                flag = Thread.interrupted();
            }
        }
    }
}
