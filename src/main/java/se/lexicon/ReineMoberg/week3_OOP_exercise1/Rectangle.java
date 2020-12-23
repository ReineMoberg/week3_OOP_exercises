package se.lexicon.ReineMoberg.week3_OOP_exercise1;

public class Rectangle {

    private double height;
    private double width;
    private double area;

    public Rectangle(){}

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        this.area = getHeight() * getWidth();
        return this.area;
    }

}
