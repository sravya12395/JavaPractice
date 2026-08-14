package basics;

public class VariablesAndDatatypes {

    public static void main (String[] args) {
        int age = 31;
        String name = "Sravya";
        float weight = 56.82343434342345453455f; //round off till 6-7 digit precision
        boolean isWorking = true;
        byte rollnum = 1;
        //double upto 15-16 digit precision
        double isHappy = 98.99999999999999999999999999d; //round off to 100 as precision is more
        double isSad = 1.0000111111d; //Gives exact value
        char gender = 'F';

        System.out.println("My name is: " + name);
        System.out.println("Roll number: " + rollnum);
        System.out.println("My age is: " + age);
        System.out.println("My Gender is: " + gender);
        System.out.println("My weight is: " + weight);
        System.out.println("Am I Working?? " + isWorking);
        System.out.println("How happy I am? " + isHappy);
        System.out.println("How sad I am? " + isSad);

    }
}
