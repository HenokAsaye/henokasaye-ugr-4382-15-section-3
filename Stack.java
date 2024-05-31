package on_linkedlist;

public class Stack {
	private Nodeassignment2 top;

    public Stack() {
        this.top = null;
    }

    // Method to push an element onto the stack
    public void push(int data) {
        Nodeassignment2 newNode = new Nodeassignment2(data);
        newNode.next = top;
        top = newNode;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to display the stack
    public void display() {
        Nodeassignment2 current = top;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}





