package oops;

public class ConstructorDemo {

    String name;

    //Default Constructor
    public ConstructorDemo () {
        System.out.println("Just a default constructor");
    }

    //Parametrized Constructor
    public ConstructorDemo (String name) {
        this.name = name; //without this line, name will be printed as null from display method.
        System.out.println("Printing name using Constructor: " + name);
    }

    //Copy Constructor
    public ConstructorDemo (ConstructorDemo cd) {
        this.name = cd.name;
        System.out.println("Just printing copy constructor");
    }

    public void display() {
        System.out.println("Printing name using display method: " + name);
    }

    public static void main (String[] args) {
        ConstructorDemo d = new ConstructorDemo();
        d.display(); //name is printed as null
        ConstructorDemo cd = new ConstructorDemo("Sravya");
        cd.display();
        ConstructorDemo copy = new ConstructorDemo(cd);
        copy.display();
    }
}
