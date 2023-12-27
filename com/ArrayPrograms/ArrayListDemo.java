package com.ArrayPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayListDemo {


    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list);
        
        /*
        // Let's see an example to traverse ArrayList elements using the Iterator interface.

        //Traversing list through Iterator
        Iterator itr = list.iterator(); //getting the Iterator
        while (itr.hasNext()) { //check if iterator has the elements
            System.out.println(itr.next()); //printing the element and move to next
        }

        */

        /*

        // Let's see an example to traverse the ArrayList elements using the for-each loop

        //Traversing list through for-each loop
        for(String fruit:list)
            System.out.println(fruit);

         */

        /*

        // The get() method returns the element at the specified index,
        // whereas the set() method changes the element.

        //accessing the element
        System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0
        //changing the element
        list.set(1,"Dates");
        //Traversing list
        for(String fruit:list)
            System.out.println(fruit);

         */

        /*
        System.out.println("Traversing list through List Iterator:");
        //Here, element iterates in reverse order
        ListIterator<String> list1 = list.listIterator(list.size());
        while (list1.hasPrevious()) {
            String str = list1.previous();
            System.out.println(str);
        }

        System.out.println("Traversing list through for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

         */

        /*

      //  Let's see an example to serialize an ArrayList object and then deserialize it.

        try {
            //Serialization
            FileOutputStream fos = new FileOutputStream("file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();

            //Deserialization
            FileInputStream fis = new FileInputStream("file");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList list1 = (ArrayList) ois.readObject();
            System.out.println(list1);
        } catch (Exception e) {
            System.out.println(e);
        }

         */

        /*

        // size() method : It is used to return the number of elements present in the list.
        System.out.println(list.size());

         */

        /*

        // isEmpty() : It returns true if the list is empty, otherwise false.
        System.out.println("Is ArrayList Empty: "+ list.isEmpty());

         */

        /*

        // void add(int index, E element) :
        // It is used to insert the specified element at the specified position in a list.

        //Adding an element at the specific position
        list.add(1,"lucky");
        System.out.println("After invoking add(int index, E element) method: "+list);

        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Sonoo");
        al2.add("Hanumat");
        //Adding second list elements to the first list
        list.addAll(al2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+list);

        ArrayList<String> al3=new ArrayList<String>();
        al3.add("John");
        al3.add("Rahul");

        //Adding second list elements to the first list at specific position
        list.addAll(1, al3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+list);

         */

        /*

     //   Here, we see different ways to remove an element.

        ArrayList<String> al=new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        al.add("Anuj");
        al.add("Gaurav");
        System.out.println("An initial list of elements: "+al);
        //Removing specific element from arraylist
        al.remove("Vijay");
        System.out.println("After invoking remove(object) method: "+al);
        //Removing element on the basis of specific position
        al.remove(0);
        System.out.println("After invoking remove(index) method: "+al);

        //Creating another arraylist
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        //Adding new elements to arraylist
        al.addAll(al2);
        System.out.println("Updated list : "+al);
        //Removing all the new elements from arraylist
        al.removeAll(al2);
        System.out.println("After invoking removeAll() method: "+al);
        //Removing elements on the basis of specified condition
        al.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression
        System.out.println("After invoking removeIf() method: "+al);
        //Removing all the elements available in the list
        al.clear();
        System.out.println("After invoking clear() method: "+al);

        // void retainAll(Collection<?> c) :
        // if common elements are present then it will return those elements & if not it will return empty []
        //	It is used to retain all the elements in the list that are present in the specified collection.

        // void ensureCapacity(int requiredCapacity)	:
        // It is used to enhance the capacity of an ArrayList instance.

         */

        /*

        // we can sort ArrayList in reverse order by using Collections class reverse()
        Collections.reverse(list);
        System.out.println("printing arrylist in reverse order : "+list);

        //sorting ArrayList in descending order
        Collections.sort(list, Collections.reverseOrder());
        //printing ArrayList after sorting in descending order
        System.out.println("ArrayList After Sorting in descending order: "+ list);

        // Sorting ArrayList in ascending Order
        Collections.sort(list);
        // printing the sorted ArrayList
        System.out.println("After Sorting in ascending Order: "+ list);

         */

        /*

        //   How to make ArrayList Read Only?
        //   The read-only means unmodifiable view of Collection in which we can not perform
        //   any operation which will change the collection through add(), remove() or set() method.
        //   We can obtain read-only collection from the existing collection by calling
        //   Collections.unmodifiableCollection() method.
        List<String> unmodifiableList= Collections.unmodifiableList(list);
        unmodifiableList.add("INDIA"); // RE saying UnsupportedOperationException
        System.out.println(list);

         */

        /*

        //  To remove dupliates from ArrayList, we can convert it into Set.
        //  Since Set doesn't contain duplicate elements, it will have only unique elements.
        List<String> list1 = Arrays.asList("Guru", "vijay", "laxman", "pooja", "vijay", "vijay");
        Set<String> removingDuplicatesInList = new HashSet<>(list1);
        System.out.print("removing duplicates by using Set interface : " + removingDuplicatesInList);

         */

        /*

        // Synchronizing ArrayList in Java
        List<String> synchronizedList = Collections.synchronizedList(list);
        // we must use synchronize block to avoid non-deterministic behavior
        synchronized (synchronizedList) {
            Iterator<String> itr = synchronizedList.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }

         */

        /*

     //   Let's see a simple example to convert ArrayList to Array and Array to ArrayList in Java:
        System.out.println("Converting ArrayList to Array" );
        String[] fruitList = list.toArray(new String[list.size()]);
    //    System.out.println(Arrays.toString(fruitList));
        for (String s : fruitList){
            System.out.println(s);
        }

        String[] books = {"java","python","scala","golang"};
        System.out.println("Converting Array to ArrayList" );
        List<String> l2 = new ArrayList<>();
        l2 = Arrays.asList(books);
        System.out.println(l2);

         */

        // example for Comparable

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1,101,"ganesh","Graduate Trainee Engineer",150000.00));
        studentList.add(new Student(3,103,"dinesh","welder",250000.00));
        studentList.add(new Student(1,104,"naresh","Design Engineer",600000.00));
        studentList.add(new Student(2,102,"ramesh","Mechanical Engineer",350000.00));

        System.out.println("printing student list without sorting : "+ studentList);
    //    Collections.sort(studentList); // this is used for comparable interface
    //    Collections.sort(studentList, new IdComparator()); // this is used for comparator interface
    //    Collections.sort(studentList, new NameComparator()); // this is used for comparator interface

        //    Comparator<Student> studentComparator = Comparator.comparing(Student::getId);
    //        Collections.sort(studentList, studentComparator);

   //     Comparator<Student> studentComparator = Comparator.comparing(Student::getId).thenComparing(Student::getName);
    //    Collections.sort(studentList, studentComparator);

            System.out.println("printing student list with sorting field " + studentList);
        /*

    // we can implement by using java8 also here's is the example
      Collections.sort(studentList, new Comparator<Student>() {
          @Override
          public int compare(Student o1, Student o2) {
              return o2.getSalary().compareTo(o1.getSalary());
          }
      });

     */

    //    Collections.sort(studentList, (o1, o2) -> o2.getSalary().compareTo(o1.getSalary()));

    //    studentList.stream().sorted((o1, o2) -> o2.getSalary().compareTo(o1.getSalary())).forEach(System.out::println);
    //    studentList.stream().sorted(Comparator.comparing(student -> student.getId())).forEach(System.out::println);
    //    studentList.stream().sorted(Comparator.comparing(Student::getDesignation)).forEach(System.out::println);
    //    studentList.stream().sorted().forEach(System.out::println); // sorting in ascending order
    //    studentList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // sorting in descending order
    //    studentList.stream().sorted(Comparator.comparingInt(Student::getId)).forEach(System.out::println);
    //    list.stream().sorted().forEach(t -> System.out.print(t + " "));

        // or to above

        //	list.stream().sorted((I1,I2)-> I1.compareTo(I2)).forEach(t-> System.out.print(t+" "));

        // or to above by using ternary operator

//	list.stream().sorted((i1,i2)-> ((i1<i2)?-1 :(i1>i2)?1 :0)).forEach(t->System.out.print(t+" "));

        // if we want to sort the collection in reverse order or in descending order
        // by sorted() method then we can use reverseOrder()

        //	list.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t+" "));


        /*

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Usage of skip() and limit()
	    List<Integer> newList = list1.stream().skip(3).limit(4).collect(Collectors.toList());
        System.out.println(newList);

        list1.stream().skip(3).limit(4).map(t-> t*2).forEach(t->System.out.print(t+" "));

         */

        /*

        // if we want to increment by 10% for given collection object elements
        List<Integer> numbersList = Arrays.asList(10, 20, 30, 40, 50);
        numbersList.stream().map(n -> (n = n + n * 10 / 100)).forEach(t -> System.out.print(t + " "));

         */

        /*

        // How to find duplicate elements in a given integers list in java using Stream functions?

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<Integer>();
        myList.stream().filter(number -> !set.add(number)).forEach(System.out::println);

         */























    }
}
