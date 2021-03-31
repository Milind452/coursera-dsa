import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Queue_LinkedList {

    // Points to the first node in the queue
    private Node first;

    // Points to the last node in the queue
    private Node last;

    // Node of the queue containing our data and a reference to the prev node
    private class Node {
        String item;
        Node next;
    }

    // Checks if the queue is empty or not
    public Boolean isEmpty() {
        return false;
    }

    // Insert new node to the end of the queue
    public void enqueue(String item) {

    }

    // Remove and return the first node in the queue
    public String dequeue() {
        return null;
    }

    public static void main(String[] args) {
        Queue_LinkedList queue = new Queue_LinkedList();
        while(!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if( s.equals("-")) {
                if(queue.isEmpty()) {
                    System.out.println("***Queue Empty***");
                    continue;
                }
                StdOut.print(queue.dequeue());
            } else {
                queue.enqueue(s);
            }
        }
    }
}
