package se.lexicon.ReineMoberg.week3_OOP_exercise1.model;

public class Author {

    //object specific variables
    private int id;             //just a serial number
    private String firstName;
    private String lastName;
    private String email;

    //constructor with no parameters
    public Author() {
    }

    //constructor with all parameters
    public Author(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //set and get for access to object variables
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
