package basics;

public class Operators {

    public static void main (String[] args)
    {
        int a = 20;
        int b = 10;

        //Arithmetic Operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a / b = " + (a / b));

        //Unary Operators
        System.out.println("Post increment a: " + (a++));
        System.out.println("Pre increment a: " + (++a));
        System.out.println("Post decrement b: " + (b--));
        System.out.println("Pre decrement b: " + (--b));

        //Assignment Operators
        a += 5;
        System.out.println("a after +5 = " + a); //a = 27
        b %= 4;
        System.out.println("b after %4 = " + b); //b = 0

        //Relational Operators
        System.out.println("Is a > b ? " + (a > b));
        System.out.println("Is a == b ?" + (a == b));
        System.out.println("Is a <= b ? " + (a <=b));

        //Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y " + (x && y));
        System.out.println("x || y " + (x || y));
        System.out.println("x && !y " + (x && !y));
        System.out.println("!x && y " + (!x && y));

        //Ternary Operator
        System.out.println("a <= b ? x : y " + ((a <= b) ? x : y));

        //instanceof Operator
        String str = "Hello";
        System.out.println(str instanceof String);
        //System.out.println(a instanceof Integer); not supported in java 21?






    }
}
