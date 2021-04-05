import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {
    
    private Node first;
    private Node last;

    int size;

    private class Node {
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
    public boolean isEmpty() {
        return size == 0;
    }

    // return the number of items on the randomized queue
    public int size() {
        return size;
    }

    // add the item
    public void enqueue(Item item) {
        if(item == null) {
            throw new IllegalArgumentException();
        }
        Node temp = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) {
            first = last;
        } else {
            temp.next = last;
        }
        size += 1;
    }

    // remove and return a random item
    public Item dequeue() {
        Item item;
        if(isEmpty()) {
            first = null;
            last = null;
            throw new java.util.NoSuchElementException();
        } else {
            item = first.item;
            first = first.next;
        }
        size -= 1;
        return item;
    }

    // return a random item (but do not remove it)
    public Item sample() {
        Item item;
        if(isEmpty()) {
            first = null;
            last = null;
            throw new java.util.NoSuchElementException();
        } else {
            item = first.item;
        }
        size -= 1;
        return item;
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Node current = first;
        private int index = 0;

        public boolean hasNext() {
            return index < size;
        }

        public Item next() {
            if(!hasNext()) {
                throw new java.util.NoSuchElementException();
            } else {
                Item item = current.item;
                index += 1;
                current = current.next;                
                return item;
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    // unit testing (required)
    public static void main(String[] args) {
        RandomizedQueue<String> queue = new RandomizedQueue<>();
    }
}
