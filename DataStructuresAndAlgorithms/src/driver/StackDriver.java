package driver;


import datastructures.CustomStack;

import java.util.Scanner;

public class StackDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomStack<Integer> stack = new CustomStack<>();
        System.out.println("<------ STACK ------>");
        while (true) {
            printDashBoard();
            try {
                int choice = getUserInput(scanner);
                runProgram(choice, scanner, stack);
            } catch (Exception e) {
                System.out.println("Exception Occurred for :: " + e.getMessage());
            }
        }
    }

    public static int getUserInput(Scanner scanner) {
        int choice = -1;
        while (choice < 0 || choice > 10) {
            System.out.println("Please enter from above options!!!");
            choice = Integer.parseInt(scanner.next());
        }
        return choice;
    }

    private static void printDashBoard() {
        System.out.println(" :: OPERATIONS :: ");
        System.out.println("1.Push \n2.Pop \n3.Peek \n4.Contains");
        System.out.println("5.Get Center Element \n6.Sort the Stack \n7.Reverse the Stack \n8.Get Size of the Stack");
        System.out.println("9.Print the List \n10.Exit Program!!!\n");
        System.out.println("Enter your Option : ");
    }

    private static void runProgram(int choice, Scanner scanner, CustomStack<Integer> stack) {
        switch (choice) {
            case 1:
                System.out.println("Enter Value!");
                int value = scanner.nextInt();
                stack.push(value);
                break;
            case 2:
                int poppedValue = stack.pop();
                if (poppedValue == -1) System.out.println("Stack is EMPTY!!!!!!");
                else System.out.println("Popped Value :: " + poppedValue);
                break;
            case 3:
                System.out.println(stack.peek());
                break;
            case 4:
                System.out.println("Enter Value to be Searched!!");
                int valueToBeSearched = scanner.nextInt();
                System.out.println(stack.contains(valueToBeSearched));
                break;
            case 5:
                System.out.println("Center Element :: " + stack.getCenter());
                break;
            case 6:
                stack.sort();
                System.out.println("Stack is Sorted!!");
                break;
            case 7:
                stack.reverseStack();
                System.out.println("Stack is Reversed!!");
                break;
            case 8:
                System.out.println("Size of the Stack :: " + stack.getSize());
                break;
            case 9:
                stack.print();
                break;
            case 10:
                System.exit(0);
        }
    }

}
