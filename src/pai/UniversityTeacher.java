package pai;

/**
 * Created by nmenego on 9/29/16.
 */
public class UniversityTeacher extends UniversityPerson {
    private int teacherId;
    private String department;

    public UniversityTeacher(int age, String name, char sex, int teacherId, String department) {
        super(age, name, sex);
        this.teacherId = teacherId;
        this.department = department;
    }

    public void sleep() {
        System.out.println("dreaming about students' tears...");
    }

    public void teach() {
        System.out.println("teaching...");
    }

    public void grade() {
        System.out.println("grading...");
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", department='" + department + '\'' +
                '}';
    }
}
