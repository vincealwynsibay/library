package repository;

import java.util.HashMap;
import java.util.ArrayList;

import data.Book;
import data.User;

public class Repository {
    private static Repository instance;

    // private static ArrayList<Book> books = new ArrayList<Book>();
    // private static ArrayList<User> users = new ArrayList<User>();
    private static HashMap<Integer, User> users = new HashMap<>();
    private static HashMap<Integer, Book> books = new HashMap<>();
    private User currentAccount = null;

    // get the Singleton instance
    public static Repository getInstance() {
        if (instance == null) {
            // seed data here

            // list of new books
            Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "April 10, 1925");
            Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "July 11, 1960");
            Book book3 = new Book("1984", "George Orwell", "June 8, 1949");
            Book book4 = new Book("The Catcher in the Rye", "J.D. Salinger", "July 16, 1951");
            Book book5 = new Book("The Hobbit", "J.R.R. Tolkien", "September 21, 1937");
            Book book6 = new Book("Fahrenheit 451", "Ray Bradbury", "October 19, 1953");

            books.put(book1.getId(), book1);
            books.put(book2.getId(), book2);
            books.put(book3.getId(), book3);
            books.put(book4.getId(), book4);
            books.put(book5.getId(), book5);
            books.put(book6.getId(), book6);

            User user1 = new User("user1", "password1");
            User user2 = new User("user2", "password2");
            User user3 = new User("user3", "password3");

            users.put(user1.getId(), user1);
            users.put(user2.getId(), user2);
            users.put(user3.getId(), user3);

            instance = new Repository();
        }
        return instance;
    }

    // get the current logged in account
    public User getCurrentAccount() {
        return currentAccount;
    }

    // TODO: login the user
    public boolean login() {

        return true;
    }

    // TODO: register the user
    public boolean register() {
        return true;
    }

    // TODO: logout the user
    public void logoutUser() {
        currentAccount = null;
    }

    // TODO: search book
    public ArrayList<Book> searchBook(String title) {
        ArrayList<Book> result = new ArrayList<Book>();
        return result;
    }

    // get all the books
    public ArrayList<Book> getBooks() {
        ArrayList<Book> list = new ArrayList<>(books.values());
        return list;
    }
}
