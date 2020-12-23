package se.lexicon.ReineMoberg;


import se.lexicon.ReineMoberg.week3_OOP_exercise1.Car;
import se.lexicon.ReineMoberg.week3_OOP_exercise1.Rectangle;

public class App
{
    public static void main( String[] args )
    {
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


        Rectangle rectangle1 = new Rectangle(6,4);
        System.out.println("Area is: " + rectangle1.getArea());
    }
}
