package driver;

import datastructures.CustomHashMap;

import java.util.Scanner;

@SuppressWarnings("InfiniteLoopStatement")
public class HashMapDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomHashMap<Integer, Integer> map = new CustomHashMap<>();
        System.out.println("<------ HASH MAP ------>");
        while (true) {
            printDashBoard();
            try {
                int choice = getUserInput(scanner);
                runProgram(choice, scanner, map);
            } catch (Exception e) {
                System.out.println("Exception Occurred for :: " + e.getMessage());
            }
        }
    }

    private static void printDashBoard() {
        System.out.println(" :: OPERATIONS :: ");
        System.out.println("1.Insert \n2.Delete \n3.Contains");
        System.out.println("4.Get Value \n5.Size \n6.Print HashMap");
        System.out.println("Enter your Option : ");
    }

    private static void runProgram(int choice, Scanner scanner, CustomHashMap<Integer, Integer> stack) {
        switch (choice) {
            case 1:
                System.out.println("Enter Key!");
                int key = scanner.nextInt();
                System.out.println("Enter Value!");
                int value = scanner.nextInt();
                stack.put(key, value);
                break;
            case 2:
                System.out.println("Enter Key to be Removed!");
                key = scanner.nextInt();
                Integer deletedValue = stack.remove(key);
                if (deletedValue == null) System.out.println("Key not Found!");
                else System.out.println("Removed!!");
                break;
            case 3:
                System.out.println("Enter Key to be Searched!");
                key = scanner.nextInt();
                boolean found = stack.containsKey(key);
                if (found) System.out.println("Found!!");
                else System.out.println("Not Found!");
                break;
            case 4:
                System.out.println("Enter Key!!");
                key = scanner.nextInt();
                Integer result = stack.get(key);
                if (result != null) System.out.println("Value :: " + result);
                else System.out.println("Not Found!!");
                break;
            case 5:
                System.out.println("Size of the Stack :: " + stack.getSize());
                break;
            case 6:
                stack.print();
                break;
            case 7:
                System.exit(0);
        }
    }

    public static int getUserInput(Scanner scanner) {
        int choice = -1;
        while (choice < 0 || choice > 7) {
            System.out.println("Please enter from above options!!!");
            choice = Integer.parseInt(scanner.next());
        }
        return choice;
    }


}
