package Saklaso33;

import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("გიორგი", 22));
        students.add(new Student("ნიკა", 19));
        students.add(new Student("ანა", 25));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
