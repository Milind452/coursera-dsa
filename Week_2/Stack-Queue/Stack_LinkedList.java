// Performance analysis of stack using linked list
// Every operation takes constant time. So time complexity = O(1)
// Every node has: 
//        8 Bytes (reference to String)
//        8 Bytes (reference to Node)
//        8 Bytes (inner class extra overhead)
//        16 Bytes (object overhead)
//  Hence, space consumed by each node ~ 40 Bytes

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

    // Checks if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Insert new node into the stack
    public void push(String item) {
        Node temp = top;
        top = new Node();
        top.item = item;
        top.next = temp;
    }

    // Remove and return the top most node
    public String pop() {
        String item = top.item;
        top = top.next;
        return item;
    }

    public static void main(String[] args) {
        Stack_LinkedList stack = new Stack_LinkedList();
        while(!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if( s.equals("-")) {
                if(stack.isEmpty()) {
                    System.out.println("***Stack Empty***");
                    continue;
                }
                StdOut.print(stack.pop());
            } else {
                stack.push(s);
            }
        }
    }
}