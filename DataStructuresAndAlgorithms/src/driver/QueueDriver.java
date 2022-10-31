package driver;

import datastructures.CustomQueue;

import java.util.Scanner;

@SuppressWarnings("InfiniteLoopStatement")
public class QueueDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomQueue<Integer> queue = new CustomQueue<>();
        System.out.println("<------ QUEUE ------>");
        while (true) {
            printDashBoard();
            try {
                int choice = getUserInput(scanner);
                runProgram(choice, scanner, queue);
            } catch (Exception e) {
                System.out.println("Exception Occurred for :: " + e.getMessage());
            }
        }
    }


    private static void printDashBoard() {
        System.out.println(" :: OPERATIONS :: ");
        System.out.println("1.EnQueue \n2.DeQueue \n3.Peek \n4.Contains");
        System.out.println("5.Get Center Element \n6.Sort the Queue \n7.Reverse the Queue \n8.Get Size of the Queue");
        System.out.println("9.Print the List \n10.Exit Program!!!\n");
        System.out.println("Enter your Option : ");
    }

    public static int getUserInput(Scanner scanner) {
        int choice = -1;
        while (choice < 0 || choice > 10) {
            System.out.println("Please enter from above options!!!");
            choice = Integer.parseInt(scanner.next());
        }
        return choice;
    }


    private static void runProgram(int choice, Scanner scanner, CustomQueue<Integer> queue) {
        switch (choice) {
            case 1:
                System.out.println("Enter Value!");
                int value = scanner.nextInt();
                queue.enqueue(value);
                break;
            case 2:
                int poppedValue = queue.dequeue();
                if (poppedValue == -1) System.out.println("Stack is EMPTY!!!!!!");
                else System.out.println("DeQueued Value :: " + poppedValue);
                break;
            case 3:
                System.out.println(queue.peek());
                break;
            case 4:
                System.out.println("Enter Value to be Searched!!");
                int valueToBeSearched = scanner.nextInt();
                System.out.println(queue.contains(valueToBeSearched));
                break;
            case 5:
                System.out.println("Center Element :: " + queue.getCenter());
                break;
            case 6:
                queue.sort();
                System.out.println("Queue is Sorted!!");
                break;
            case 7:
                queue.reverseQueue();
                System.out.println("Queue is Reversed!!");
                break;
            case 8:
                System.out.println("Size of the Queue :: " + queue.getSize());
                break;
            case 9:
                queue.print();
                break;
            case 10:
                System.exit(0);
        }
    }

}
