package OOPs.P3;
 class Car {
    String brand;
    String color;
   private int speed;


    public void drive() {
        System.out.println(brand + " is driving at " + speed);
    }
    //getter and setter

     public void setSpeed(int speed) {
         this.speed = speed;
     }

     public int getSpeed() {
        if(speed<0)
        {
            return 0;
        }
         return speed;
     }

 }
public class Main {
    public static void main(String[] args) {
Car c1 = new Car();
c1.setSpeed(-120);
        System.out.println(c1.getSpeed());
        c1.setSpeed(150);
        System.out.println(c1.getSpeed());
    }
}
