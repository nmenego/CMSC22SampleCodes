package pai;

/**
 * Created by nmenego on 9/26/16.
 */
public class Student extends Person {
    private int studentId;

    public Student(int age, String name, char sex, int studentId) {
        super(age, name, sex);
        this.studentId = studentId;
    }

    public void registerForClass() {
        System.out.println("registering...");
    }

    public void attendClass() {
        System.out.println("attending...");
    }

    public void doAssignment() {
        System.out.println("homework...");
    }

    public void takeExam() {
        System.out.println("taking exam...");
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                '}';
    }
}
