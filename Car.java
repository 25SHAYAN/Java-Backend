package OOPs.P2;

public class Car {
    String brand;
    String color;
    int speed;
    //constructor
    public Car(String brand,String color , int  speed)
{       System.out.println("constructor called");
    this.brand = brand;this.color = color;this.speed = speed;
    }
    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }

}
