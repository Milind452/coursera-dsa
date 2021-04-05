import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {
    
    private Node first;
    private Node last;

    int size;

    private class Node() {
        Item item;
        Node next;
    }

    // construct an empty randomized queue
    public RandomizedQueue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    // is the randomized queue empty?
    public boolean isEmpty();

    // return the number of items on the randomized queue
    public int size();

    // add the item
    public void enqueue(Item item);

    // remove and return a random item
    public Item dequeue();

    // return a random item (but do not remove it)
    public Item sample();

    // return an independent iterator over items in random order
    public Iterator<Item> iterator();

    // unit testing (required)
    public static void main(String[] args);
}
