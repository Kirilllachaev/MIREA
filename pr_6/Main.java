package pr_6;


import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student[] f = new Student[80];
        for (int i = 0; i < f.length; i++)
            f[i] = new Student((int)(Math.random()*1000)%300, 17+(int)(Math.random()*10)%5);
        new MergeSort().sort(f, Student.class, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Result: [");
        for (int i = 0; i < f.length; i++)
            System.out.println(i+": "+f[i]);
        System.out.println("]");
    }

}
