package com.ArrayPrograms;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test100 {

    public static void main(String[] args) throws FileNotFoundException {

        /*

        // To set given array in ascending order by predefined function

        int a[] = {50,20,80,55,100};
        Arrays.sort(a);
        System.System.out.println(Arrays.toString(a));

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
        System.System.out.println("Ascending order of given array is = "+ Arrays.toString(a));

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
    //  System.System.out.println("descending order of given array is = "+ Arrays.toString(a));

        for(int i=0;i<a.length;i++){

			System.System.out.print(a[i]+" ");
		}

        */


        /*

        // to set given String array in one by one

        String a[] = {"java", "python", "node.js", "smalltek"};
//      int a[] = {45,20,30,50,5,9,100};
        System.System.out.println("by using toString() = " + Arrays.toString(a));
        System.System.out.println("by using asList() = " + Arrays.asList(a));
        System.System.out.println("by using deepToString() = " + Arrays.deepToString(a));

        */


        /*

        // to find given String is palindrome or not
        String a = "madam";
        StringBuffer sb = new StringBuffer(a);
        System.System.out.println("printing reverse order of given string = " + sb.reverse());

        */


        /*

        // to find given String is palindrome or not
        String a = "madam";
        String reverse = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            reverse = reverse + a.charAt(i);
        }
        if (reverse.equals(a)) {
            System.System.out.println("given String is palindrome");

        } else {
            System.System.out.println("given String is not a palindrome");
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
        System.System.out.println("Largest number in given array is = " + max);

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
        System.System.out.println("Smallest number in given array is = " + min);

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
        System.System.out.println("2nd Largest number in given array is = " + a[1]);

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
        System.System.out.println("2nd Smallest number in given array is = "+ a[1]);

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
            System.System.out.println("given number is palindrome");
        } else {
            System.System.out.println("given number is not palindrome");
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
            System.System.out.println("given number is prime");
        } else {
            System.System.out.println("given number is not prime");
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
                System.System.out.print(no + " ");
            }
        }

        */


        /*

        // how to move all zeros to end
        int a[] = {1, 0, 7, 0, 5, 0, 4, 9, 0, 3, 0};
        int count = 0;

        Arrays.sort(a);
        System.System.out.println("printing array elements after sorting elements in asc order "
                + Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[count] = a[i]; // all non- zero elements shifting towards backward.
                count++;
            }
        }
        while (count < a.length) {
            a[count++] = 0;
        }
        System.System.out.println("after moving zeros to end " + Arrays.toString(a));

        */


        /*

        // to find how many times a character occurence in a given string
        // groupingBy method does it will group according to their type
		// Function.identity() will accepts the same arguments and returns
        String a = "abbcccdddd";

        Map<String, Long> charOccurence = Arrays.stream(a.split(""))
                                                .collect(Collectors.groupingBy(Function.identity(),
                                                        Collectors.counting()));
        System.System.out.println(charOccurence);

        */


        /*

        // how to find number of occurence
        List<Integer> list = Arrays.asList(1, 2, 5, 1, 2, 3, 6, 6, 8, 6, 10);

        Map<Integer, Long> intOccurrence = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.System.out.println(intOccurrence);

        */


        /*

        // to find the duplicate String with frequency using stream API
        List<String> list = Arrays.asList("java","python","java");
        Map<String, Long> listOfDuplicateString = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(listOfDuplicateString);

         */


        /*

        // to find the frequency of each String in array;
        String a[] = {"java", "python", "java"};

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {

                if (j < i && a[i] == a[j]) {
                    break;
                }

                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > 0) {
                System.System.out.println(a[i] + " = " + count);
            }
        }

        */


        /*

        // to find the frequency of each character String;
        String str = "abbcccdddd";
        char a[] = str.toCharArray();

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {

                if (j < i && a[i] == a[j]) {
                    break;
                }
                if (a[i] == a[j]) {
                    count++;
                }
            }

            if (count > 0) {
                System.System.out.println(a[i] + " = " + count);
            }
        }

        */


        /*

        // to find the frequency of each number in array;
        int a[] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {

                if (j < i && a[i] == a[j]) {
                    break;
                }

                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > 0) {
                System.System.out.println(a[i] + " = " + count);
            }
        }

        */

        /*

        // Encapsulated class
         public class Student {
            private int rollNumber;
            private String name;

            public int getRollNumber() {
                return rollNumber;
            }

            public String getName() {
                return name;
            }

            public void setRollNumber(int rollNumber) {
                this.rollNumber = rollNumber;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
          class Demo {
            public static void main(String[] args) {

                Student s = new Student();
                s.setRollNumber(-1);
                s.setName("vijay");
                System.System.out.println("roll number = " + s.rollNumber + " " + "name = " + s.getRollNumber());
            }

        }

        */


        /*

        // Factorial program using for loop
        int number = 5;
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.System.out.println("Factorial for given number is = "+fact);

        */


        /*

        // by using recurssion method finding factorial for given number
        class Factorial{
            static int fact = 1;
            public static void calFact(int n){
                if (n >= 1){
                    fact = fact * n;
                    calFact(n-1);
                }
            }
        }
        public class Demo {
            public static void main(String[] args) {
                int n = 5;
                Factorial.calFact(n);
                System.System.out.println("Factorial of " + n + " is " + Factorial.fact);
            }
        }

        */


        /*

        // An ArmStrong number is a positive m-digit number
        // that is equal to sum of mth power of their digits
        // 153 = 1^3 + 5^3 + 3^3 = 153
        int number = 154;
        int length = 0;
        int temp1 = number;

        // 1st step is to calculate number of digits
        while (temp1 != 0) {
            length = length + 1;
            temp1 = temp1 / 10;
        }

        // 2nd step is to reverse the number and multiply with same number
        // & then add it into another variable

        int temp2 = number;
        int reminder;
        int arms = 0;

        while (temp2 != 0) {
            reminder = temp2 % 10;
            int multiply = 1;
            for (int i = 1; i <= length; i++) {
                multiply = multiply * reminder;
            }
            arms = arms + multiply;
            temp2 = temp2 / 10;

        }
        if (arms == number) {
            System.System.out.println("given number is an armstrong number");
        } else {
            System.System.out.println("given number is not an armstrong number");
        }

         */


        /*

        // to print current local date and time using java8 API

        System.System.out.println("current local date : " + LocalDate.now());
        System.System.out.println("current local time : " + LocalTime.now());
        System.System.out.println("current local date & time : " + LocalDateTime.now());

        */


        /*

        // checked exception
        // after program execution it will throw unreported exception FileNotFoundException;
        // must be caught or declared to be thrown

        PrintWriter pw = new PrintWriter("abcd.txt");
        pw.println("Hi I am Laxman");

        */


        /*

        // Immutable class

        final public class Employee {

            private final String pancardNo;

            public Employee(String pancardNo){
                this.pancardNo = pancardNo;
            }

            public String getPancardNo() {
                return pancardNo;
            }
        }
        class Demo {
            public static void main(String[] args) {
                Employee employee = new Employee("GHNMQ25641S")
                employee.getPancardNo();
            }
        }

        */


        /*

        // Find Missing Element in given array

        int a[]={1,2,3,4,5,6,7,8,10};
        // no. of elements = 9
        // expected no. of elements = 10
        // 1+2+3+4+5+6+7+8+10=46
        // 1+2+3+4+5+6+7+8+9+10=55

        int expected_no_of_elements = a.length + 1;
        int total_sum = expected_no_of_elements * (expected_no_of_elements + 1)/2;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.System.out.println("Missing number in given array = " + (total_sum - sum));

         */


        /*

        // FibonacciSeries
        // fibonacci means addition of previous two numbers & we have to use swapping in this

        int a=0,b=1;
        System.System.out.print(a + " " + b);
        int c;

        for (int i = 0; i <= 10 ; i++) {
            c = a + b;
            System.System.out.print(" " + c);
            a=b;
            b=c;
        }

         */


        /*

        // FibonacciSeries by recurssion method
        public class FibonacciSeries {
            private static int a = 0, b = 1, c;
            public static void fibonacci(int i) {
                if (i >= 1) {
                    c = a + b;
                    System.System.out.println(" " + c);
                    a = b;
                    b = c;
                    fibonacci(i - 1);
                }
            }

            public static void main(String[] args) {
                System.System.out.println(a + " " + b);
                FibonacciSeries.fibonacci(10);
            }
        }

         */


        /*

        // to rotate left array
        // original array is [1,2,3,4,5],
        // if we left rotate array one time i.e n=1 we will get o/p = [2,3,4,5,1]
        // if we left rotate array two times i.e n=2 we will get o/p = [3,4,5,1,2]

        int a[] = {1, 2, 3, 4, 5};
        int n = 2; // n is for how many times we want to rotate.
        System.out.println("arrays elements in original order ");
        System.out.print(Arrays.toString(a));
        System.out.println("\narray elements after rotating left direction");

        for (int i = 0; i < n; i++) {

            int first = a[0], j; // i am holding 1st element in a variable otherwise it will change.

            for (j = 0; j < a.length - 1; j++) {
                // basically shifting means one by one we have to rotate the elements
                // we are shifting towards left direction
                // after shifting 1st element will become last element
                a[j] = a[j + 1]; // shifting next to element
            }
            a[j] = first;

        }
        System.out.print(Arrays.toString(a));

         */


        /*

        // how to Rotate right direction
        int a[] = {1, 2, 3, 4, 5};
        int n = 3; // rotating elements n times
        System.out.println("Array elements in original order ");
        System.out.print(Arrays.toString(a));
        System.out.println("\nArray elements after rotating right direction ");

        for (int i = 0; i < n; i++) {
            int last = a[a.length - 1], j; // storing last element of array.

            for (j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1]; // shifting array elements one by one
            }
            a[0] = last; // shifting last element of array will be added to the start of array

        }
        System.out.print(Arrays.toString(a));

         */



        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15, 98);

        /*

        List<Integer> evenNumbersFromGivenList = list.stream().filter(even -> even % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbersFromGivenList);

         */

        /*

        list.stream().filter(odd -> odd % 2 != 0).forEach(t -> System.out.print(t + " "));

         */

        // now we have to sort this list by using Collections.sort() method
        /*


        Collections.sort(list); // it will take list as parameter & sort according to ascending order default
        System.out.println(list);

         */

      /*

    //  Comparator<Integer> c = (i1,i2)-> i1.compareTo(i2); // it will sort in ascending order
        Comparator<Integer> c = (i1,i2)-> i2.compareTo(i1); // it will sort in descending order
        Collections.sort(list,c);
        System.out.println(list);

       */

        /*

        //  or to above Comparator by ternary operator
        Comparator<Integer> c = (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0; // it will sort in ascending order
    //  Comparator<Integer> c = (i1, i2) -> (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0; // it will sort in descending order
        Collections.sort(list, c);
        System.out.println(list);

         */


        // by sorted() method we can sort also
        // if we are not providing comparator in sorted()
        // then it will sort the collection by default in ascending order
        /*

    //    list.stream().sorted().forEach(t -> System.out.print(t + " "));

        */


        // or to above
        /*

 //       list.stream().sorted((I1, I2) -> I1.compareTo(I2)).forEach(t -> System.out.print(t + " "));
//        list.stream().sorted((i1, i2) -> i2.compareTo(i1)).forEach(t -> System.out.print(t + " "));

        // or to above by using ternary operator
//	list.stream().sorted((i1,i2)-> ((i1<i2)?-1 :(i1>i2)?1 :0)).forEach(t->System.out.print(t+" "));

         */


        /*

        // or to above by providing comparator and then pass the comparator in sorted() method
		Comparator<Integer> c = (i1,i2) -> i1.compareTo(i2);
        List<Integer> integerList = list.stream().sorted(c).collect(Collectors.toList());
        System.out.println(integerList);

        */

        /*

        // if we want to sort the collection in reverse order or in ascending order
        // by sorted() method then we can use reverseOrder()
        list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t+" "));

         */

        /*

        // if we want minimum number in given collection object then we can use min()
        Optional<Integer> minValue = list.stream().min((i1, i2) -> i1.compareTo(i2));
        System.out.println(minValue.get());

         */


        /*

        // if we want maximum number in given collection object then we can use max()
        Optional<Integer> maxValue = list.stream().max((i1, i2) -> i1.compareTo(i2));
        System.out.println(maxValue.get());

         */

        /*

        // How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(no->!set.add(no)).forEach(t->System.out.print(t + " "));

         */


        /*

        // printing only unique values by using distinct()
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().distinct().forEach(t->System.out.print(t + " "));

         */


        /*

        // counting no.of elements present in list
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count = myList.stream().count();
        System.out.println(count);

         */


        /*

        List<String> listOfString = Arrays.asList("John", "Mary", "Kim", "David", "Smith", "Jacob");
        //	by using traditional approach we can sort collection by forEach loop
        for (String listByForEachLoop : listOfString){
            System.out.print(listByForEachLoop + " ");
        }

         */


        /*

        //  or to above by using stream API forEach()
        List<String> listOfString = Arrays.asList("John", "Mary", "Kim", "David", "Smith", "Jacob");
        listOfString.stream().forEach(System.out::println);

         */


        /*

        // if we want to find starts with some letter
        List<String> listOfString = Arrays.asList("John", "Mary", "Kim", "David", "Smith", "Jacob");
        listOfString.stream().filter(s->s.startsWith("J")).forEach(System.out::println);

         */


        /*

        // if we want to find starts with some number
        list.stream().map(s-> s + " ").filter(s->s.startsWith("1")).forEach(t-> System.out.print(t + " "));

         */


        /*

        // we can create thread by extending the Thread class
        class MyThread extends Thread{

            public void run(){

                for (int i = 0; i < 10; i++) {
                    System.out.println("child-thread");
                }
            }

        }

        public class DemoThread {
            public static void main(String[] args) {

                MyThread myThread = new MyThread();
                myThread.start();
                for (int i = 0; i < 10; i++) {
                    System.out.println("main-thread");
                }
            }
        }

         */

        /*

        // we are creating a Thread by implementing Runnable Interface
        class MyRunnable implements Runnable {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("child-thread");
                }
            }
        }
        class ThreadDemo {
            public static void main(String[] args) {
                MyRunnable myRunnable = new MyRunnable();
                Thread t = new Thread(myRunnable);
                t.start();
                for (int i = 0; i < 10; i++) {
                    System.out.println("main-thread");
                }

            }
        }

         */

        /*

        System.out.println(String.class.getClassLoader()); // null
        System.out.println(Test100.class.getClassLoader()); // jdk.internal.loader.ClassLoaders$AppClassLoader@251a69d7
        System.out.println(Student.class.getClassLoader()); // jdk.internal.loader.ClassLoaders$AppClassLoader@251a69d7

         */

        /*

        double mb = 1024 * 1024; // which will return in mb
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Maximum memory : " + runtime.maxMemory() / mb);
        System.out.println("Total memory : " + runtime.totalMemory() / mb);
        System.out.println("Free memory : " + runtime.freeMemory() / mb);
        System.out.println("counsumed memory : " + (runtime.totalMemory() - runtime.freeMemory()) / mb);

         */


        /*

        // Singleton class
        final class SingletonExample {

            private static SingletonExample s = null;

            private SingletonExample(){

            }

            public static SingletonExample getInstance(){
                if (s == null){
                    s = new SingletonExample();
                }
                return s;
            }
        }
        class SingletonDemo {

            SingletonExample s1 = SingletonExample.getInstance();
            System.out.println(s1.hashCode());

            SingletonExample s2 = SingletonExample.getInstance();
			System.out.println(s2.hashCode());
        }

         */

        /*

        // find the first & last occurence in array

        class Test {

            public static void findFirstAndLast(int arr[], int x){

                int n = arr.length;
                int first = -1;
                int last =-1;
                for(int i=0; i<n; i++){
                    if(x != arr[i]){
                        continue;
                    }
                    if(first = -1){
                        first =i;
                        last =i;
                    }
                    if(first != -1){
                        System.out.println("First occurrence " + first);
                        System.out.println("Last occurence "+ last);

                    }
                    else{
                        System.out.println("Not Found");
                    }
                }



            }

            public static void main(String[] args){
                int arr[]={5,7,7,8,8,8,8,8,10};
                int x=8;
                findFirstAndLast(arr,x)
            }
        }

         */


                /*

        // to send the custom exception
        class TooYoungException extends RuntimeException {

            public TooYoungException(String message){
                super(message);
            }

            public static void main(String[] args) {
                int age = 20;
                if (age<18){
                    throw new TooYoungException("your are not eligible to vote");
                } else {
                    System.out.println("You can vote succesfully");
                }
            }
        }

         */



/*

// NoClassDefFoundError Example

class JavaTpoint
{
    void show()
    {
        System.out.println( "It is JavaTpoint section" );
    }
}
class NoClassDefFoundErrorExample{
    public static void main(String args[])
    {
        SEO data = new SEO();
        data.showData();
        data.show();
    }
}


*/


        /*

class ClassCastExceptionExample {

	public static void main(String[] args) {
		// example for classCastException

		try {
		Object o = new String("Mahesh");
	//	Object o = new Object();
		String s = (String) o; //java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String
		System.out.println(s); // o/p : Mahesh

		} catch (ClassCastException e) {
			System.out.println("not allowed to type cast parent object to child object");
			e.printStackTrace();

		}

	}
}


*/
        /*

        char[] c = new char[]{'a','b','c'};

        String s = new String("abc");

        System.out.println(c);
        System.out.println(s);

         */
    }

}
