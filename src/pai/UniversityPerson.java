package pai;

/**
 * Created by nmenego on 9/29/16.
 */
public abstract class UniversityPerson {
    private int age;
    private String name;
    private char sex;

    public UniversityPerson(int age, String name, char sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public abstract void sleep();

    public void talk() {
        System.out.println("talking...");
    }

    public void walk() {
        System.out.println("walking...");
    }

    public void breathe() {
        System.out.println("breathing...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
