package se.lexicon.ReineMoberg;


import se.lexicon.ReineMoberg.week3_OOP_exercise1.Car;
import se.lexicon.ReineMoberg.week3_OOP_exercise1.Rectangle;
import se.lexicon.ReineMoberg.week3_OOP_exercise1.data.BookData;
import se.lexicon.ReineMoberg.week3_OOP_exercise1.model.Author;
import se.lexicon.ReineMoberg.week3_OOP_exercise1.model.Book;

public class App
{
    public static void main( String[] args )
    {
        //Exercise 1
        /*Car car1 = new Car();
        car1.setId("PPX 647");
        car1.setColor("Red");
        car1.setModel("Volvo C30");
        car1.setYear(2012);
        car1.setMotorSize("1,6 Litre");
        car1.setDriving(false);

        car1.drive();
        System.out.println();
        //car1.printAll();        //for verification*/


        //Exercise 2
        /*Rectangle rectangle1 = new Rectangle(6,4);
        System.out.println("Area is: " + rectangle1.getArea());*/

        //Exercise 3
        Author author1 = new Author(1, "Herman", "Lindqvist", "herman.lindqvist@gmail.com");
        Author author2 = new Author(2, "Simon", "Singh", "simon.singh@gmail.com");
        Author author3 = new Author(3, "Vicki", "Myron", "vicki.myron@gmail.com");

        Book book1 = new Book(1, "Dewey", 2009, 79, author3);
        Book book2 = new Book(2, "Kodboken", 1999, 129, author2);
        Book book3 = new Book(3, "Historien om Sverige", 2002, 199, author1);
        Book book4 = new Book(4, "Histotien om Spanien", 1991, 89, author1);

        BookData data = new BookData();     //create an array of books that serves as a database
        data.addBook(book1);
        data.addBook(book2);
        data.addBook(book3);
        data.addBook(book4);

        System.out.println("Find author using book object----------------------------------------------");
        data.printAuthorByBook(book1);
        data.printAuthorByBook(book2);
        data.printAuthorByBook(book3);
        data.printAuthorByBook(book4);
        System.out.println("Find books using author object----------------------------------------------");
        data.printBooksByAuthor(author1);
        data.printBooksByAuthor(author2);
        data.printBooksByAuthor(author3);

    }
}
