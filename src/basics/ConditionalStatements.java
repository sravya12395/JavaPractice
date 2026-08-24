package basics;

public class ConditionalStatements {

    public static void main (String[] args)
    {
        String name = "Sravya";
        int age = 31;
        boolean isDiabetic = false;
        System.out.println("Patient name: " + name);
        System.out.println("Patient age: " + age);
        System.out.println("Is Patient Diabetic? : " + isDiabetic);

        if (age > 35)
        {
            System.out.println("High risk for Pregnancy");
        }
        else {
            if (isDiabetic == true)
            {
                System.out.println("High risk due to Diabetes");
            }
            else {
                System.out.println("Low risk for Pregnancy");
            }
        }

        //Switch statement
        int num = 10;
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            case 10:
                System.out.println("Number is 10");
                break; //default also gets printed without break
            default:
                System.out.println("Not present");
        }
    }
}
