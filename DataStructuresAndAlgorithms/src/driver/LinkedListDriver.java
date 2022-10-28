package driver;

import datastructures.CustomLinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class LinkedListDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        System.out.println("<------ LINKED LIST ------>");

        while (true) {
            printDashBoard();
            try {
                int choice = getUserInput(scanner);
                runProgram(choice, scanner, list);
            } catch (Exception e) {
                System.out.println("Exception Occurred for :: " + e.getMessage());
            }
        }
    }

    private static void printDashBoard() {
        System.out.println("Please choose from Below :: ");
        System.out.println("1.Insert \n2.Insert at any position \n3.Delete \n4.Delete at any Position");
        System.out.println("5.Get Center Element \n6.Sort the List \n7.Reverse the List \n8.Get Size");
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

    private static void runProgram(int choice, Scanner scanner, CustomLinkedList<Integer> list) {
        switch (choice) {
            case 1:
                System.out.println("Enter Value!");
                int value = scanner.nextInt();
                list.add(value);
                break;
            case 2:
                System.out.println("Enter Value!");
                value = scanner.nextInt();
                System.out.println("Enter position!");
                int position = scanner.nextInt();
                list.add(position, value);
                break;
            case 3:
                Integer deletedValue = list.delete();
                if (deletedValue != null) System.out.println("Deleted Value :: " + deletedValue);
                else System.out.println("List is Empty!!");
                break;
            case 4:
                System.out.println("Enter position!");
                position = scanner.nextInt();
                deletedValue = list.delete(position);
                if (deletedValue != null) System.out.println("Deleted Value :: " + deletedValue);
                else System.out.println("List is Empty!!");
                break;
            case 5:
                System.out.println("Center Element :: " + list.getCenterNode().getValue());
                break;
            case 6:
                list.sort();
                System.out.println("List is Sorted!!");
                break;
            case 7:
                list.reverse();
                System.out.println("List is Reversed!!");
                break;
            case 8:
                System.out.println("Size of the List :: " + list.getSize());
                break;
            case 9:
                list.print();
                break;
            case 10:
                System.exit(0);
        }
    }

}
