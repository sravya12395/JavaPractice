package basics;

import java.util.Arrays;

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
            System.out.println(arr[i]); //this will print hashcode value if we do not override toString in Student class
        }

        //Passing arrays to methods
        int sumArr[] = {12,13,14,15,16};
        System.out.println("Sum of all the elements is: " + sum(sumArr));
        //returning elements from the array
        System.out.println("Elements in the array are: " + returnArr(sumArr));
        //[I@6e8cf4c6 -- printing hashcode when doing like above
        //For printing array elements, we need to use toString method like below.
        System.out.println("Elements in the array are: " + Arrays.toString(returnArr(sumArr)));

    }

    public static int[] returnArr(int sumArr[]) {
        /*int returnA[] = new int[5];
        for(int i=0;i<sumArr.length;i++) {
            returnA[i] = sumArr[i];
        }
        return returnA;*/
        return sumArr;
    }

    public static int sum(int arr[]) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        return sum;
    }
}
