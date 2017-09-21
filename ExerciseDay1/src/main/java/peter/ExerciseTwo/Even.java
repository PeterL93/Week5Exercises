package peter.ExerciseTwo;

/**
 *
 * @author Peter
 */
public class Even {

    private int n = 0;
    private int count = 0;

    public int next() {
        n++;
        n++;
        return n;
    }

    public synchronized void inc() {
        int temp = count;
        temp++;
        count = temp;
    }
}
