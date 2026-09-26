package oops;

public class ShapesMain {

    public static void main (String[] args) {
//        Shapes c = new Circle("Red", 10);
//        Shapes r = new Rectangle("Green", 3,5);
//        //Instead of manually printing area and color seperately,
//        // we can use toString to print all together
//        /*System.out.println("Area of circle is : " +  c.area());
//        System.out.println("Color of circle is: " + c.getColor());
//        System.out.println("Area of rectangle is : " + r.area());
//        System.out.println("Color of rectangle is: " + r.getColor());*/
//        System.out.println(c);
//        System.out.println(r);
        // now making it short by using an array of objects

        Shapes[] s = {new Circle("Red", 10),
                        new Rectangle("Green", 10, 5)};
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
