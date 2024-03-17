package repository;

import java.util.ArrayList;

import data.Book;
import data.User;

public class Repository {
    private static Repository instance;

    private static ArrayList<Book> books = new ArrayList<Book>();
    private static ArrayList<User> users = new ArrayList<User>();
    private User currentAccount = null;

    // get the Singleton instance
    public static Repository getInstance() {
        if (instance == null) {
            // seed data here

            books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "April 10, 1925"));
            books.add(new Book("To Kill a Mockingbird", "Harper Lee", "July 11, 1960"));
            books.add(new Book("1984", "George Orwell", "June 8, 1949"));
            books.add(new Book("The Catcher in the Rye", "J.D. Salinger", "July 16, 1951"));
            books.add(new Book("The Hobbit", "J.R.R. Tolkien", "September 21, 1937"));
            books.add(new Book("Fahrenheit 451", "Ray Bradbury", "October 19, 1953"));

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
        return books;
    }
}
