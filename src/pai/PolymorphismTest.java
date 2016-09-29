package pai;

/**
 * Created by nmenego on 9/26/16.
 */
public class PolymorphismTest {

    public static void main(String[] args) {
        Person jude = new Person(18, "jude", 'm');
        Student jane = new Student(18, "jane", 'f', 12344);
        Teacher jake = new Teacher(26, "jake", 'm', 12313123, "DCS");

        // upbinding...
        Person[] persons = {jude, jane, jake};

        // latebinding...
        for(Person person: persons) {
            System.out.println(person.toString());
        }
    }
}
