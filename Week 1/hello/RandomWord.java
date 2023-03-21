/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/** Random word picker */
public class RandomWord {
    /**
     * Reads a sequence of words from standard input and prints one of those
     * words at random
     *
     * @param args sequence of words
     */
    public static void main(String[] args) {
        double p = 1;
        String champion = "";

        while (!StdIn.isEmpty()) {
            String nextString = StdIn.readString();
            if (StdRandom.bernoulli(1 / p)) {
                champion = nextString;
            }
            p++;
        }
        StdOut.println(champion);
    }
}
