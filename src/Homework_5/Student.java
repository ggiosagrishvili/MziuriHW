package Homework_5;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;
    int grade;


    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student" +
                "id" + id +
                "name" + name +
                "grade" + grade;
    }
}


class Main {
    public static void main(String[] args) throws Exception {
        Student[] students = {
                new Student(1, "gg", 85),
                new Student(2, "asas", 90),
                new Student(3, "sdfsdfd", 78),
                new Student(4, "asd", 92),
                new Student(5, "qwe", 88)
        };

        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Gio\\IdeaProjects\\MziuriHomeworks\\src\\Homework_5\\students.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(students);
        out.close();
        fileOut.close();

        System.out.println("სტუდენტების მონაცემები ჩაწერილია students.txt ფაილში.");
    }
}

