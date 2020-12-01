package pr_6;

public class Student implements Comparable<Student> {

    private int GPA;
    private int age;

    public Student(int GPA, int age) {
        this.GPA = GPA;
        this.age = age;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(GPA, other.GPA);
    }

    @Override
    public String toString() {
        return "Студент (" +
                "балл ЕГЭ = " + GPA +
                ", возраст = " + age +
                ')';
    }
}
