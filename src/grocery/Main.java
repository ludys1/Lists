package grocery;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static groceryList groceryList = new groceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    private static void searchForItem() {
        System.out.print("Enter grocery item for serching: ");
        String item = scanner.nextLine();
        if (groceryList.searchItem(item) != null) {
            System.out.println("Znalazłem " + item + " na liście");
        } else {
            System.out.println("Na liście nie ma tego elementu");
        }
    }

    private static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNumb = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNumb-1);
    }

    private static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNumb = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replaced item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumb-1, newItem);
    }

    private static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void printInstruction() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - to print choice options");
        System.out.println("\t 1 - to print the list of grocery items");
        System.out.println("\t 2 - to add an item to the list");
        System.out.println("\t 3 - to modify an item on the list");
        System.out.println("\t 4 - to remove an item from the list");
        System.out.println("\t 5 - to search for an item in the list");
        System.out.println("\t 6 - to quit");

    }


}
