package oops;

public interface Addition {

    int add (int a, int b);

    //by default, methods in interface are public abstract,
    //however, Java8 has this default method, static method and
    //functional interface annotation features
    default void display() {
        System.out.println("Default method in Add interface");
    }
    static void display2() {
        System.out.println("Static method in Add interface");
    }
}
