package data;

import java.util.ArrayList;

public class User {

    // User Class
    // - id (based in static numofusers)
    // - username
    // - password
    // - ArrayList<String> ReservedBooks (id of book)

    private static int numofusers = 0;
    private int id;
    private String username;
    private String password;
    private ArrayList<Book> borrowedBooks;

    public User(String username, String password) {
        this.id = numofusers;
        this.username = username;
        this.password = password;
        borrowedBooks = new ArrayList<Book>();
        numofusers++;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public String toString() {
        return "[ \n " +
                "\t id: " + id + "\n" +
                "\t username: " + username + "\n" +
                "\t password: " + password + "\n" +
                " ]";
    }
}
