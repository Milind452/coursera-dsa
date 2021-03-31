// Performance analysis of queue using linked list
// Every operation takes constant time. So time complexity = O(1)

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Queue_LinkedList {

    // Points to the first node in the queue
    private Node first = null;

    // Points to the last node in the queue
    private Node last = null;

    // Node of the queue containing our data and a reference to the prev node
    private class Node {
        String item;
        Node next;
    }

    // Checks if the queue is empty or not
    public Boolean isEmpty() {
        return first == null;
    }

    // Insert new node to the end of the queue
    public void enqueue(String item) {
        Node temp = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) {
            first = last;
        } else {
            temp.next = last;
        }
    }

    // Remove and return the first node in the queue
    public String dequeue() {
        if(isEmpty()) {
            last = null;
        } else {
            String item = first.item;
            first = first.next;
            return item;
        }
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
