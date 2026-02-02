package OOPs.P4;

import java.sql.SQLOutput;

record Bike(String bike,int speed){}


public class Main {
    public static void main(String[] args) {
        //RECORDS
        Bike bike = new Bike("BMW",222);
        System.out.println("Speed  " + bike.speed());
        System.out.println("Brand " + bike.bike());
        System.out.println(bike); //tostring
    }
}
