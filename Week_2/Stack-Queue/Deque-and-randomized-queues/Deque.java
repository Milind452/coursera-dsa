import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.ListIterator;

public class Deque<Item> implements Iterable<Item> {
    
    private Node first;
    private Node last;

    int size;

    private class Node {
        Item item;
        Node next;
        Node prev;
    }

    // construct an empty deque
    public Deque() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    // is the deque empty?
    public boolean isEmpty() {
        return first == null;
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
        Node temp = first;
        first = new Node();
        first.item = item;
        first.next = temp;
        first.prev = null;
        if(isEmpty()) {
            last = first;
        } else {
            temp.prev = first;
        }
    }

    // add the item to the back
    public void addLast(Item item) {
        Node temp = last;
        last = new Node();
        last.item = item;
        last.next = null;
        last.prev = temp;
        if(isEmpty()) {
            first = last;
        } else {
            temp.next = last;
        }
    }

    // remove and return the item from the front
    public Item removeFirst() {
        Item item = first.item;
        if(isEmpty()) {
            first = null;
            last = null;
        } else {
            first = first.next;
            first.prev = null;
        }
        return item;
    }

    // remove and return the item from the back
    public Item removeLast() {
        Item item = last.item;
        if(isEmpty()) {
            first = null;
            last = null;
        } else {
            last = last.prev;
            last.next = null;
        }
        return item;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            current.prev = null;
            return item;
        }
    }

    // unit testing (required)
    public static void main(String[] args) {

    }
}