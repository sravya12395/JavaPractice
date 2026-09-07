package oops;

public class PharmaStudent extends Student {
    private int prev_marks;
    private double annualfee;

    public PharmaStudent (int prev_marks, double annualfee) {
        this.annualfee = annualfee;
        this.prev_marks = prev_marks;
    }

    public static double feeDiscount(int prev_marks, double annualfee) {
        if (prev_marks > 80) {
            return 10;
        } else {
            return 0;
        }
    }

    public static void main (String[] args) {

        Student st = new Student();
        st.setName("Sravya");
        st.setAge(31);
        st.setGender("Female");
        PharmaStudent bt = new PharmaStudent (75,100000);

        double discount = feeDiscount(bt.prev_marks, bt.annualfee);
        System.out.println("Name of the Student: " + st.getName());
        System.out.println("Age of the Student: " + st.getAge());
        System.out.println("Gender of the Student: " + st.getGender());
        System.out.println("Prev college marks: " + bt.prev_marks);
        System.out.println("Discount percentage: " + discount + "%");
        System.out.println("Annual fee after discount: " + (bt.annualfee - (bt.annualfee * discount/100)));

    }
}
