package com.company;

public class TestMerge {
    public static void main(String[] args) {
        Student[] students = {new Student(4), new Student(5), new Student(3), new Student(1), new Student(2)};
        Student[] students_ = {new Student(9), new Student(10), new Student(8), new Student(7)};
        Student[] std = new Student[students.length + students_.length];
        MergeSorting.mergeSorting(students, students_, std);

        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i]);
        }
    }
}