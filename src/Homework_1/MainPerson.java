package Homework_1;

public class MainPerson {
    public static void main(String[] args) {
        Doctor[] doctors = {
                new Doctor("fddfdf", "gio", 40, 40, "assas", "უფროსი ექიმი", "evex", 15),
                new Doctor("dfdfdf", "nika", 50, 50, "asasas", "ექიმი", "gia guli", 20),
                new Doctor("dfdfdf", "gela", 45, 45, "sss", "უფროსი ექიმი", "evex", 25)
        };

        Doctor oldestDoctor = doctors[0];
        Doctor mostExperiencedDoctor = doctors[0];

        for (Doctor doctor : doctors) {
            if (doctor.getDoctorAge() > oldestDoctor.getDoctorAge()) {
                oldestDoctor = doctor;
            }
            if (doctor.getExperience() > mostExperiencedDoctor.getExperience()) {
                mostExperiencedDoctor = doctor;
            }
        }

        System.out.println("ყველაზე ასაკოვანი ექიმი:");
        oldestDoctor.displayInfo();

        System.out.println("\nყველაზე დიდი სტაჟის ექიმი:");
        mostExperiencedDoctor.displayInfo();
    }
}
