package Homework_27;
import java.util.ArrayList;

public class Students {
    String firstName;
    String lastName;
    String personalId;
    double averageGrade;

    public Students(String firstName, String lastName, String personalId, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }


    class Student {
        public static void main(String[] args) {
            ArrayList<Students> students = new ArrayList<>();
            students.add(new Students("გიორგი", "ასას", "0101010101", 85.5));
            students.add(new Students("ნინო", "ასას", "0202020202", 92.3));
            students.add(new Students("ლაშა", "ასას", "0303030303", 78.4));
            students.add(new Students("მარიამ", "ასსას", "0404040404", 88.9));
            students.add(new Students("დავით", "ასას", "0505050505", 81.0));

            for (int i = 0; i < students.size() - 1; i++) {
                for (int j = i + 1; j < students.size(); j++) {
                    if (students.get(i).averageGrade > students.get(j).averageGrade) {
                        Students temp = students.get(i);
                        students.set(i, students.get(j));
                        students.set(j, temp);
                    }
                }
            }

            for (Students student : students) {
                System.out.println(student);
            }
        }
    }
}