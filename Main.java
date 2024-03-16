import java.util.Arrays;
import java.util.Scanner;

import repository.Repository;

public class Main {
    public static void main(String[] args) {
        Repository repository = Repository.getInstance();
        Scanner scanner = new Scanner(System.in);
        // IF LOGGED IN SHOW MENU
        System.out.println("Welcome to the Library Management System");

        String input = "";
        while (true) {
            if (repository.getCurrentAccount() != null) {
                showMenu();

                // if (input.equals("1")) {
                // System.out.println(repository.getBooks());
                // } else if (input.equals("2")) {
                // // TODO: SEARCH BOOK INPUT
                // System.out.println("Enter book title: ");
                // } else if (input.equals("3")) {
                // // TODO: BORROW BOOK INPUT
                // System.out.println("Enter book id: ");
                // } else if (input.equals("4")) {
                // // TODO: RETURN BOOK INPUT
                // System.out.println("Enter book id: ");
                // } else if (input.equals("5")) {
                // repository.logoutUser();
                // }

            } else {
                showLoginRegister();

                // if (input.equals("1")) {
                // // TODO: LOGIN INPUT
                // } else if (input.equals("2")) {
                // // TODO: REGISTER INPUT
                // }
            }

            scanner.close();
        }
    }

    public static void showMenu() {
        System.out.println("1. Get All Books");
        System.out.println("2. Search Book");
        System.out.println("3. Borrow Book");
        System.out.println("4. Return Book");
        System.out.println("5. Logout");

    }

    public static void showLoginRegister() {
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
    }
}
