package com.ArrayPrograms;

import java.util.Arrays;

public class Test100 {

    public static void main(String[] args) {

        /*

        // To set given array in ascending order by predefined function

        int a[] = {50,20,80,55,100};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        */

        /*

        // To print given array in ascending order

        int a[] = {45, 20, 60, 15, 3, 47};
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Ascending order of given array is = "+ Arrays.toString(a));

        */

        /*

        // To print given array in descending order

        int a[]={45,20,60,15,3,47};

        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    //  System.out.println("descending order of given array is = "+ Arrays.toString(a));

        for(int i=0;i<a.length;i++){

			System.out.print(a[i]+" ");
		}

        */

        /*

        // to set given String array in one by one

        String a[] = {"java", "python", "node.js", "smalltek"};
//      int a[] = {45,20,30,50,5,9,100};
        System.out.println("by using toString() = " + Arrays.toString(a));
        System.out.println("by using asList() = " + Arrays.asList(a));
        System.out.println("by using deepToString() = " + Arrays.deepToString(a));

        */

        /*

        // to find given String is palindrome or not
        String a = "madam";
        StringBuffer sb = new StringBuffer(a);
        System.out.println("printing reverse order of given string = " + sb.reverse());

        */

        /*

        // to find given String is palindrome or not
        String a = "madam";
        String reverse = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            reverse = reverse + a.charAt(i);
        }
        if (reverse.equals(a)) {
            System.out.println("given String is palindrome");

        } else {
            System.out.println("given String is not a palindrome");
        }

        */

        /*

        // find the Largest number in given array
        int a[] = {45, 20, 60, 15, 3, 47};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Largest number in given array is = " + max);

        */

        /*

        // find the Smallest number in given array

        int a[] = {45, 20, 60, 15, 3, 47};
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Smallest number in given array is = " + min);

        */

        /*

        // find the 2nd Largest number in given array

        int a[] = {45, 20, 60, 15, 3, 47};
        int temp;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("2nd Largest number in given array is = " + a[1]);

        */

        /*

        // find the 2nd Smallest number in given array

        int a[] = {45,20,60,15,3,47};
        int temp;

        for(int i=0;i<a.length;i++){

            for(int j=i+1; j<a.length;j++){

                if(a[i]>a[j]){

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("2nd Smallest number in given array is = "+ a[1]);

        */

        /*

        // given number is palindrome or not
        int n = 121;
        int temp = n;
        int reminder, reverse = 0;

        while (temp > 0) {

            reminder = temp % 10; // it will reminder everytime
            reverse = (reverse * 10) + reminder;
            temp = temp / 10;
        }
        if (reverse == n) {
            System.out.println("given number is palindrome");
        } else {
            System.out.println("given number is not palindrome");
        }

        */

        /*

        // to check given number is prime number or not
        int n = 5;
        int count = 0;

        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("given number is prime");
        } else {
            System.out.println("given number is not prime");
        }

        */

        /*

        // to find prime numbers from 1 to 100;
        for (int no = 1; no <= 100; no++) {
            int count = 0;

            for (int i = 2; i < no - 1; i++) {

                if (no % i == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.print(no + " ");
            }
        }

        */



        // how to move all zeros to end
        int a[] = {1, 0, 7, 0, 5, 0, 4, 9, 0, 3, 0};
        int count = 0;

        Arrays.sort(a);
        System.out.println("printing array elements after sorting elements in asc order "
                + Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[count] = a[i];
                count++;
            }
        }
        while (count < a.length) {
            a[count++] = 0;
        }
        System.out.println("after moving zeros to end " + Arrays.toString(a));



    }

}
