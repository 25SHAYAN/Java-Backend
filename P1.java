package OOPs.P5;

class Car {
    private String brand;
    private String color;
    private int speed;

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public void drive() {
        System.out.println(brand + " (" + color + ") is driving at " + speed + " km/h");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {     // validation - encapsulation advantage
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative");
        }
    }
}

public class P1 {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota", "Red", 200);
        c1.drive();

        // Modify using setter
        c1.setSpeed(110);
        System.out.println("Updated speed: " + c1.getSpeed());

        Car c2 = new Car("Maruti", "Yellow", 100);
        c2.drive();
    }
}
