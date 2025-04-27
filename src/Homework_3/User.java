package Homework_3;

import java.util.Scanner;

class User {
    String firstName;
    String lastName;
    String personalId;
    int birthMonth;
    int birthDay;
    String username;
    String password;

    User(String firstName, String lastName, String personalId,int birthMonth, int birthDay,String username, String password){
        if (firstName.length() < 2) {
            System.out.println("სახელი უნდა შედგებოდეს მინიმუმ 2 სიმბოლოსგან.");
        }
        if (lastName.length() < 3) {
            System.out.println("გვარი უნდა შედგებოდეს მინიმუმ 3 სიმბოლოსგან.");
        }
        if (birthMonth < 1 || birthMonth > 12) {
            System.out.println("დაბადების თვე უნდა იყოს 1,12 შუალედში.");
        }
        if (birthDay < 1 || birthDay > 31) {
            System.out.println("დაბადების რიცხვი უნდა იყოს 1,31 შუალედში");
        }
        if (username.length() < 4) {
            System.out.println("მომხმარებლის სახელი უნდა იყოს მინიმუმ 4 სიმბოლო");
        }
        if (password.length() < 8 || password.length() > 15) {
            System.out.println("პაროლის სიგრძე უნდა იყოს 8,15 სიმბოლო");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.personalId = personalId;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.username = username;
        this.password = password;
    }
}


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("სახელი: ");
            String firstName = scanner.nextLine();

            System.out.print("გვარი: ");
            String lastName = scanner.nextLine();

            System.out.print("პირადი ნომერი: ");
            String personalId = scanner.nextLine();

            System.out.print("დაბადების თვე: ");
            int birthMonth = scanner.nextInt();

            System.out.print("დაბადების რიცხვი: ");
            int birthDay = scanner.nextInt();
            scanner.nextLine();

            System.out.print("მომხმარებლის სახელი: ");
            String username = scanner.nextLine();

            System.out.print("პაროლი: ");
            String password = scanner.nextLine();

            User user = new User(firstName, lastName, personalId, birthMonth, birthDay, username, password);
            System.out.println("მომხმარებელი წარმატებით შეიქმნა!");
            System.out.println("სახელი: " + user.firstName);
            System.out.println("გვარი: " + user.lastName);
        } catch (Exception e) {
            System.out.println("შეცდომა: " + e.getMessage());
        }
    }
}
