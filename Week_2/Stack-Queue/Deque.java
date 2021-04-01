import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

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
        return size == 0;
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
        if( item == null ) {
            throw new IllegalArgumentException();
        }
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
        size += 1;
    }

    // add the item to the back
    public void addLast(Item item) {
        if( item == null ) {
            throw new IllegalArgumentException();
        }
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
        size += 1;
    }

    // remove and return the item from the front
    public Item removeFirst() {
        Item item;
        if(isEmpty()) {
            first = null;
            last = null;
            throw new java.util.NoSuchElementException();
        } else {
            item = first.item;
            first = first.next;
            // first.prev = null;
        }
        size -= 1;
        return item;
    }

    // remove and return the item from the back
    public Item removeLast() {
        Item item;
        if(isEmpty()) {
            first = null;
            last = null;
            throw new java.util.NoSuchElementException();
        } else {
            item = last.item;
            last = last.prev;
        }        
        size -= 1;
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
            if(!hasNext()) {
                throw new java.util.NoSuchElementException();
            } else {
                Item item = current.item;
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
        Deque<String> deque = new Deque<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if(s.equals("run")) {
                for(String k : deque) {
                    StdOut.print(k);
                }
            }
            if (s.equals("-")) {
                StdOut.print(deque.removeLast());
            }                
            else {
                deque.addLast(s);
            }
        }
    }
}