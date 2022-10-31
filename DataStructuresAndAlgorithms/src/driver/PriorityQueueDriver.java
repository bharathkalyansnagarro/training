package driver;

import datastructures.CustomPriorityQueue;

import java.util.Scanner;

@SuppressWarnings("InfiniteLoopStatement")
public class PriorityQueueDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomPriorityQueue queue = new CustomPriorityQueue();
        System.out.println("<------ PRIORITY QUEUE ------>");
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

    private static void runProgram(int choice, Scanner scanner, CustomPriorityQueue queue) {
        switch (choice) {
            case 1:
                System.out.println("Enter Value!");
                int value = scanner.nextInt();
                queue.add(value);
                break;
            case 2:
                int poppedValue = queue.remove();
                if (poppedValue == -1) System.out.println("HEAP is EMPTY!!!!!!");
                else System.out.println("Removed Value :: " + poppedValue);
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
                System.out.println("Size of the Heap :: " + queue.size());
                break;
            case 7:
                queue.printHeap();
                break;
            case 8:
                System.exit(0);
            default:
        }
    }

    private static void printDashBoard() {
        System.out.println(" :: OPERATIONS :: ");
        System.out.println("1.Add \n2.Remove \n3.Peek \n4.Contains");
        System.out.println("5.Get Center Element \n6.Get Size of the Queue");
        System.out.println("7.Print the List \n8.Exit Program!!!\n");
        System.out.println("Enter your Option : ");
    }

    public static int getUserInput(Scanner scanner) {
        int choice = -1;
        while (choice < 0 || choice > 8) {
            System.out.println("Please enter from above options!!!");
            choice = Integer.parseInt(scanner.next());
        }
        return choice;
    }

}
