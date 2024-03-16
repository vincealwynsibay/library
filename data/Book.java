package data;

import java.util.LinkedList;

import repository.Repository;

public class Book {

    // Book Class
    // - id (based on static num of books)
    // - Title
    // - Author
    // - Publication Date
    // - Status
    // - Queue ReservationList

    private static int numofbooks = 0;
    private int id;
    private String title;
    private String author;
    private String publicationDate;
    private BookStatus status;
    private LinkedList<User> queueReservationList;

    public Book(String title, String author, String publicationDate) {
        this.id = numofbooks;
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.status = BookStatus.AVAILABLE;
        this.queueReservationList = new LinkedList<User>();
        numofbooks++;
    }

    // use enums for status bruh gamita ang repository para pag kuha sa user
    // TODO: check out
    public void checkout() {
        Repository repository = Repository.getInstance();

        // di pani final
        // queueReservationList.add(repository.getCurrentAccount());
        // if (queueReservationList.poll().equals(repository.getCurrentAccount())) {
        // status = BookStatus.BORROWED;
        // }
        repository.getCurrentAccount().borrowBook(this);
    }

    // TODO: reserve
    // TODO: return book

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public BookStatus getStatus() {
        return status;
    }

    public LinkedList<User> getQueueReservationList() {
        return queueReservationList;
    }

    public String toString() {
        return "[ \n" +
                "\tid: " + id + "\n" +
                "\ttitle: " + title + "\n" +
                "\tauthor: " + author + "\n" +
                "\tpublicationDate: " + publicationDate + "\n" +
                "\tstatus: " + status + "\n" +
                "]";

    }

}
