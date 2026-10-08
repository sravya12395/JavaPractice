package oops;

public class Bicycle implements Vehicle {

    int gear;
    int speed;

    public void display() {
        System.out.println("Bicycle is at gear: " + gear + " and speed: " + speed);
    }
    public void changeGear(int newGear) {
        gear = newGear;
    }
    public void speedUp(int newSpeed) {
        speed = speed + newSpeed;
    }
    public void speedDown(int newSpeed) {
        speed = speed - newSpeed;
    }
    public void road() {
        System.out.println("Testing abstract method from first interface");
    }

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.changeGear(3);
        System.out.println(b.speed); // since value is not initialized, it will be 0 by default.
        b.speedUp(4);
        b.speedDown(1);
        b.display();
        System.out.println("Number of wheels: " + b.wheeler);
        b.road();
    }
}
