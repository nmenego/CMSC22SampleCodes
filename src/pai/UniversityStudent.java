package pai;

/**
 * Created by nmenego on 9/29/16.
 */
public class UniversityStudent extends UniversityPerson {
    private int studentId;

    public UniversityStudent(int age, String name, char sex, int studentId) {
        super(age, name, sex);
        this.studentId = studentId;
    }

    public void sleep() {
        System.out.println("no sleep! lots of work to do!");
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
