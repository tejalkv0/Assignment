import java.util.Scanner;

public class Car {
    String brand;
    String model;
    // int speed = 0;
    // int speed=45;
    int speed = 4;

    void acc() {
        if (speed > 40) {
            System.out.println(brand + " is in max speed");
        } else {
            speed = speed + 5;
            System.out.println(brand + " accelarating " + speed);

        }
    }

    void brake() {
        if (speed > 0) {
            speed = speed - 5;
            System.out.println(brand + " slowing down " + speed);
        } else {
            System.out.println(brand + " vechile is not moving");
        }
    }

    void setter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter car brand");
        brand = sc.nextLine();
        System.out.println("enter the car model");
        model = sc.nextLine();
    }

    public static void main(String[] args) {
        // Car c1 = new Car();
        // c1.brand = "BMW";
        // Car c2 = new Car();
        // c2.brand = "audi";
        // System.out.println(c1.brand);
        // System.out.println(c2.brand);

        // c2.acc();
        // c2.acc();
        // c1.brake();
        // c2.brake();
        // c2.brake();
        // c2.brake();
        Car c1=new Car();
        c1.setter();
    }

}
