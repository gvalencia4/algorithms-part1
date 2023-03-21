/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        // - create an object at each site
        // - create virtual top and bottom sites that connect to all bottom and
        // top objects

    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        // make the site open
        // connect to all adjacent open sites
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col)

    // is the site (row, col) full?
    public boolean isFull(int row, int col)

    // returns the number of open sites
    public int numberOfOpenSites()

    // does the system percolate?
    public boolean percolates() {
        // does the virtual top site connect to the virtual bottom site?
    }

    // test client (optional)
    public static void main(String[] args)
}
