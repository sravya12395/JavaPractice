package oops;

@FunctionalInterface
public interface Subtraction {

    /* Functional interface is the one with only one abstract method and any number of
    default and static methods
     */
    /* Using functional interface annotation is optional, but it allows to identify compile errors if
    more than one abstract method is created
     */
    int sub(int a, int b);

    default void display() {
        display2();
        System.out.println("Default method in Sub interface");
    }
    //Java9 introduced private methods in interface
    /*private methods in interface cannot be inherited by implementing classes,
    they should be used within the interface itself*/
    private void display2() {
        System.out.println("Private method in Sub interface");
    }
}



