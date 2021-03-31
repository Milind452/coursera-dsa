import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class GenericStack<Item> {

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

    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        while(!StdIn.isEmpty()) {
            int s = StdIn.readInt();
            if( s == 0 ) {
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