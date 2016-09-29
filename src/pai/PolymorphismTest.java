package pai;

/**
 * Created by nmenego on 9/26/16.
 */
public class PolymorphismTest {

    public static void main(String[] args) {
        Person jude = new Person(18, "jude", 'm');
        Person jane = new Student(18, "jane", 'f', 12344);
        Person jake = new Teacher(26, "jake", 'm', 12313123, "DCS");

        Student janeS = (Student) jane;
        janeS.getStudentId();
        // upbinding...
        Person[] persons = {jude, jane, jake};

        // latebinding...
        for(Person person: persons) {
            person.talk();
            System.out.println(person.toString());
        }
    }
}
