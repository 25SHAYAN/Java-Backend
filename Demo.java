package OOPs.P1;

public class Demo {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.color = "red";
        c1.speed = 200;
        c1.drive();
        //2nd object creation
        Car c2 = new Car();
        c2.brand = "Kia";
        c2.color = "blue";
        c2.speed = 100;
        c2.drive();


        //inbuilt methods from java
       // Date d = new Date();
        //File f = new File();

    }
}
