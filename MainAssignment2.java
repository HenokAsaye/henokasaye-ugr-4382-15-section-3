package on_linkedlist;

public class MainAssignment2 {
	public static void main(String[] args) {
        Linked_list list = new Linked_list();
        
        list.insertAtPos(10, 1);
        list.insertAtPos(20, 2);
        list.insertAtPos(30, 3);
        list.display(); 

        list.deleteAtPosition(2);
        list.display(); 

        list.insertAtPos(40, 2);
        list.display(); 

        list.deleteAfterNode(list.head);
        list.display(); 

        System.out.println(list.searchNode(30)); 
        System.out.println(list.searchNode(50)); 

        Stack stack = new Stack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.display(); 

        System.out.println(stack.pop()); 
        stack.display(); 

        System.out.println(stack.peek()); 
        stack.display(); 

        System.out.println(stack.isEmpty()); 
    }
	
}
