package se.lexicon.ReineMoberg.week3_OOP_exercise1;

public class Car {

    private String id;
    private int year;
    private String model;
    private String color;
    private String motorSize;
    private boolean driving;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(String motorSize) {
        this.motorSize = motorSize;
    }

    public boolean isDriving() {
        return driving;
    }

    public void setDriving(boolean driving) {
        this.driving = driving;
    }

    public void drive() {
        System.out.println(getModel()+" with motor "+getMotorSize()+" can drive now.");
    }

    public void printAll() {
        System.out.println("Id: "+getId());
        System.out.println("Model: "+getModel());
        System.out.println("Year: "+getYear());
        System.out.println("Color: "+getColor());
        System.out.println("Motor size: "+getMotorSize());
    }
}
