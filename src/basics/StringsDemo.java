package basics;

public class StringsDemo {

    public static void main (String[] args) {
        String s1 = "Sravya";
        String s2 = "Hemanth";
        String s3 = "Nithya";

        String s4 = new String("Sravya");
        String s5 = new String("Hemanth");
        StringBuffer s6 = new StringBuffer("Nithya");

        System.out.println(s1 + " " + s2 + " " + s3 + " " + "\n" + s4 + " " + s5 + " " + s6);

        System.out.println(s1==s4); //compares memory location
        System.out.println(s1.equals(s4)); // compares content

        s1.concat(" Allam"); //concat happens but it will be discarded as it is not assigned to any variable
        s5.concat(" Bugga");

        String s7 = s1.concat(" Allam");
        String s8 = s5.concat(" Bugga");

        System.out.println(s1 + " " + s5); //concat not possible as Strings are immutable
        System.out.println(s7 + " " + s8); //storing the result to new variable is only possible
        s6.append(" Bugga"); //append function is used for concatenation in string buffer and builder
        System.out.println(s6);




    }
}
