package TOdolist;

public class TODOLIST {
	private Nodeassignment1 head;

    public TODOLIST() {
        this.head = null;
    }

    public void addToDo(Task task) {
        Nodeassignment1 newNode = new Nodeassignment1(task);
        if (head == null) {
            head = newNode;
        } else {
            Nodeassignment1 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markToDoAsCompleted(String title) {
        Nodeassignment1 current = head;
        while (current != null) {
            if (current.task.getTitle().equalsIgnoreCase(title)) {
                current.task.Markcompleted();
                return;
            }
            current = current.next;
        }
        System.out.println("Task with title \"" + title + "\" not found.");
    }

    public void viewToDoList() {
        Nodeassignment1 current = head;
        if (current == null) {
            System.out.println("To-Do List is empty.");
            return;
        }
        while (current != null) {
            Task task = current.task;
            System.out.println("Title: " + task.getTitle());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Completed: " + task.iscompleted());
            System.out.println();
            current = current.next;
        }
    }

    public static void main(String[] args) {
        TODOLIST toDoList = new TODOLIST();
        
        // Adding tasks
        toDoList.addToDo(new Task("Buy groceries", "Buy milk, bread, and eggs"));
        toDoList.addToDo(new Task("Complete assignment", "Finish the Java assignment"));
        toDoList.addToDo(new Task("Workout", "30 minutes of cardio"));

        // Viewing the to-do list
        System.out.println("To-Do List:");
        toDoList.viewToDoList();

        // Marking a task as completed
        toDoList.markToDoAsCompleted("Complete assignment");

        // Viewing the to-do list again
        System.out.println("Updated To-Do List:");
        toDoList.viewToDoList();
    }
}


