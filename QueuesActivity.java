package queuesactivity;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueuesActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        // 1. Read or define student names and 2. Add each name using offer()
        System.out.println("Enter initial student names (type 'done' to stop):");
        
        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            queue.offer(name);
        }

        //Challenge
        System.out.println("\n--- Starting Service ---");
        
        if (!queue.isEmpty()) {
            // Serve the first student
            System.out.println("Served: " + queue.poll());

            // Add a new student after the first student is served
            System.out.print("\nEnter a new student to add to the queue: ");
            String newStudent = scanner.nextLine();
            queue.offer(newStudent);

            System.out.println("\n--- Updated Service Order ---");
        }

        // 3. Repeatedly use poll() until the queue is empty and 4. Display each student
        while (!queue.isEmpty()) {
            System.out.println("Served: " + queue.poll());
        }

        scanner.close();
    }
}
