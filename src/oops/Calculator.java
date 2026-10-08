package oops;

public class Calculator implements Addition, Subtraction {


    //Multiple inheritance using interface
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    //default methods in interface are also public.
    /*since this method is present in both interfaces,
    we need to call the actual method using interfacename.super.methodname()*/
    /*If there is only one parent interface we can directly call default method from main method
    no need to override it*/
    @Override
    public void display() {
        Addition.super.display();
        Subtraction.super.display();
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition of a and b: " + c.add(5,4));
        System.out.println("Subtraction of a and b : " + c.sub(90,40));
        c.display();
        //static methods from interface are called directly using interface name
        //these methods are not inherited by implementing classes and cant be overriden
        Addition.display2();
    }
}
