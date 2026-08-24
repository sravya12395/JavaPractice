package basics;

public class FirstArray {

    public static void main (String[] args) {

        int iArr[] = {1,2,3,4,5}; //primitive array
        String sArr[] = {"Sravya","Hemanth","Nithya"}; // non primitive array

        System.out.println("Length of integer array is: " + iArr.length);
        System.out.println("Length of String array is: " + sArr.length);

        System.out.println("Printing the elements of integer array: ");
        for (int i = 0;i < iArr.length; i++) {
            System.out.print(iArr[i] + " ");
        }
        System.out.println();

        System.out.println("Printing the elements of string array: ");
        for(int i = 0; i < sArr.length; i++) {
            System.out.print(sArr[i] + " ");
        }
        System.out.println();

        //now checking non primitive array with objects
        /*Student s1 = new Student (4, "Nithya");
        Student s2 = new Student(31, "Sravya");
        Student s3 = new Student(32, "Hemanth");
        //s1.display();
        Student arr[] = new Student[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;*/
        //instead of manually assigning student objects to each index, we can initialize student object like below.
        Student arr[] = {
                new Student(4,"Nithya"),
                new Student(31, "Sravya"),
                new Student(32, "Hemanth")};
        for (int i=0;i< arr.length;i++) {
            arr[i].display();
        }
    }
}
