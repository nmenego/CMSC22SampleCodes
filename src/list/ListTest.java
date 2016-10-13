package list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nmenego on 10/13/16.
 */
public class ListTest {

    public static void main(String[] args) {
        List<StudentInformation> myList = new ArrayList();

        StudentInformation a = new StudentInformation("123", "Hansolo");
        StudentInformation b = new StudentInformation("12313", "Chewbacca");
        myList.add(a);
        myList.add(b);
        System.out.println(myList.size());

        for(StudentInformation s: myList) {
            System.out.println(s);
        }



    }
}

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
