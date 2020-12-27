package se.lexicon.ReineMoberg.week3_OOP_exercise1.model;

public class Book {

    //object specific variables
    private int id;             //just a serial number
    private String title;
    private int year;
    private double price;
    private Author author;      //author object
    //private Author[] authors; //for more than one author per book

    //constructor with no parameters
    public Book() {
    }

    //constructor with all parameters
    public Book(int id, String title, int year, double price, Author author) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    //set and get for access to object variables§
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
