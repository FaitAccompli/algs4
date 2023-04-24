import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/******************************************************************************
 *  Compilation:  javac-algs4 RandomWord.java
 *  Execution:    java-algs4 RandomWord < $inputPath
 *
 *  This program reads a sequence of words from standard input and prints one of those words uniformly at random.
 *  Uses Knuth's method: when reading the ith word, it selects it with probability 1/i to be the champion, replacing the
 *  previous champion. After reading all the words, it prints the surviving champion.
 *
 *  % java-algs4 RandomWord < ./in/coin.txt
 *  heads
 *
 ******************************************************************************/
public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        int ctr = 1;
        while (!StdIn.isEmpty()) {
            String contender = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / (double) ctr)) {
                champion = contender;
            }
            ctr++;
        }
        StdOut.println(champion);
    }
}
