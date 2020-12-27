package se.lexicon.ReineMoberg.week3_OOP_exercise1.data;

import se.lexicon.ReineMoberg.week3_OOP_exercise1.model.Author;
import se.lexicon.ReineMoberg.week3_OOP_exercise1.model.Book;

import java.util.Arrays;

public class BookData {

    //object specific variable is an array of books (book-objects)
    private Book[] books = new Book[0];

    //add a new book to array of books (book-objects)
    public void addBook(Book book) {                                            //parameter is a new book-object
        Book[] newBookArray = Arrays.copyOf(books, books.length + 1); //copy book array and add a post
        newBookArray[newBookArray.length - 1] = book;                           //add new book to last post
        books = newBookArray;                                                   //assign copied array to book array
    }

    //print book by book title. every book has an author-object
    public void printAuthorByBook(Book book) {                                   //parameter is book-object
        System.out.println("Name of book: " + book.getTitle() + "\tAuthor: " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
    }

    //print books by a specific author
    public void printBooksByAuthor(Author author) {                             //parameter is an author-object
        Book[] result = new Book[0];                                            //create an empty book array variable
        for (Book book : books) {                                               //search through book array in this class/object
            if (book.getAuthor().getFirstName().equalsIgnoreCase(author.getFirstName())) {   //compare with parameter
                result = Arrays.copyOf(result, result.length + 1);     //copy local array variable and add a post
                result[result.length - 1] = book;                                //add book to last post
            }
        }
        for (Book book : result) {                                                    //for every post in local book array
            System.out.println(book.getTitle() + " Author: " + book.getAuthor().getFirstName());    //print book and author first name
        }
    }

}
