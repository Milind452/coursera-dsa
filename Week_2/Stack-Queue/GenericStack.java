import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class GenericStack<Item> implements Iterable<Item>{

    // Points to the top of the stack
    private Node top = null;

    // Node of the stack containing our data and a reference to the prev node
    private class Node {
        Item item;
        Node next;
    }

    // Checks if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Insert new node into the stack
    public void push(Item item) {
        Node temp = top;
        top = new Node();
        top.item = item;
        top.next = temp;
    }

    // Remove and return the top most node
    public Item pop() {
        Item item = top.item;
        top = top.next;
        return item;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = top;

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        GenericStack<Data> stack = new GenericStack<>();
        while(!StdIn.isEmpty()) {
            String s = StdIn.readString();
            int x = StdIn.readInt();
            Data data = new Data(s, x);
            if( s.equals("-") ) {
                if(stack.isEmpty()) {
                    System.out.println("***Stack Empty***");
                    continue;
                }
                data = stack.pop();
                data.display();
            } else {
                stack.push(data);
            }
        }
        for(Data data : stack) {
            data.display();
        }
    }
}