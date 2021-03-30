import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Stack_LinkedList {

    // Points to the top of the stack
    private Node top = null;

    // Node of the stack containing our data and a reference to the prev node
    private class Node {
        String item;
        Node next;
    }

    // Checks is the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Insert new node into the stack
    public void push(String item) {

    }

    // Remove and return the top most node
    public String pop() {

        return null;
    }

    public static void main(String[] args) {
        Stack_LinkedList stack = new Stack_LinkedList();
        while(!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if( s.equals("-")) {
                StdOut.print(stack.pop());
            } else {
                stack.push(s);
            }
        }
    }
}