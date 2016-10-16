package list;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by nmenego on 10/13/16.
 */
public class ListTest {

    public static void main(String[] args) {
        List<StudentInformation> myList = new ArrayList<StudentInformation>();

        StudentInformation a = new StudentInformation("123", "Hansolo");
        StudentInformation b = new StudentInformation("12313", "Chewbacca");
        // adding items to our list.
        myList.add(a);
        myList.add(b);

        // getting the size of a list
        System.out.println(myList.size());

        // looping through a liqst
        for(StudentInformation s: myList) {
            System.out.println(s);
        }


        List<Integer> listOfIntegers = new ArrayList<Integer>();
        listOfIntegers.add(5);
        listOfIntegers.add(new Integer(3));
    }
}

// Plain old Java object (POJO)
class StudentInformation {
    private String studentNumber;
    private String name;

    public StudentInformation(String studentNumber, String name) {
        this.studentNumber = studentNumber;
        this.name = name;
    }

    public String toString() {
        return studentNumber + ": " + name;
    }
}
