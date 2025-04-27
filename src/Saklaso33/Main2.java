package Saklaso33;

import java.util.*;

class Student2 {
    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getAge(), s1.getAge());
    }
}

public class Main2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("გიორგი", 22));
        students.add(new Student("ნიკა", 19));
        students.add(new Student("ანა", 25));

        students.sort(new AgeComparator());

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
