package mobilePhone;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("668 445 125");
    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();

        while (!quit) {
            System.out.println("\n Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
//                case 3:
//                    updateContact();
//                    break;;
//                case 4:
//                    removeContact();
//                    break;
//                case 5:
//                    queryContact();
//                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void addNewContact() {
    }

//    private static void printContacts() {
//        System.out.println("Contact list");
//        mobilePhone.printContacts();
//    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
        "1 - to print contats\n" +
        "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print available list of actions.\n");
        System.out.println("Choose your action: ");
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }
}
