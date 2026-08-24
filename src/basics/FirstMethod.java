package basics;

public class FirstMethod {

    public static void demoMethod() {
        /*FirstMethod f = new FirstMethod();
        f.demoMethod2(); //calling instance method from static method requires object
         */
        System.out.println("My first static method");
    }

    public void demoMethod2() {
        System.out.println("My first instance method");
        //demoMethod(); // Calling method inside method
    }

    public static void main (String[] args) {
        demoMethod(); //Static methods can be called without object creation
        FirstMethod m = new FirstMethod();
        m.demoMethod2(); //instance methods can only be called using an object

        System.out.println(m.hashCode()); // Pre defined method
        System.out.println(Math.random()); //Pre defined method from Math class
    }
}
