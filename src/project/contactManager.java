package project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ContactManager {
    public static void main(String[] args) {
        List<Contact> contactList;
        try {
            contactList = FileManager.readFromFile();
        } catch (IOException | ClassNotFoundException e) {
            contactList = new ArrayList<>();
        }

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("მთავარი მენიუ:");
            System.out.println("1. კონტაქტის დამატება");
            System.out.println("2. კონტაქტის წაშლა");
            System.out.println("3. რედაქტირება");
            System.out.println("4. კონტაქტების სია");
            System.out.println("5. გასვლა");
            System.out.print("აირჩიეთ: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("სახელი: ");
                    String firstName = scanner.next();
                    System.out.print("გვარი: ");
                    String lastName = scanner.next();
                    System.out.print("ტელეფონი: ");
                    String phoneNumber = scanner.next();
                    System.out.print("ელფოსტა: ");
                    String email = scanner.next();
                    contactList.add(new Contact(firstName, lastName, phoneNumber, email));
                    try {
                        FileManager.saveToFile(contactList);
                        System.out.println("კონტაქტი დამატებულია ");
                    } catch (IOException e) {
                        System.out.println("შეცდომა მონაცემების შენახვისას ");
                    }
                    break;

                case 2:
                    System.out.print("შეიყვანეთ წასაშლელი კონტაქტის ნომერი: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    if (deleteIndex >= 0 && deleteIndex < contactList.size()) {
                        contactList.remove(deleteIndex);
                        try {
                            FileManager.saveToFile(contactList);
                            System.out.println("კონტაქტი წაშლილია ");
                        } catch (IOException e) {
                            System.out.println("შეცდომა მონაცემების შენახვისას ");
                        }
                    } else {
                        System.out.println("არასწორი ნომერი ");
                    }
                    break;

                case 3:
                    System.out.print("შეიყვანეთ რედაქტირებადი კონტაქტის ნომერი: ");
                    int editIndex = scanner.nextInt() - 1;
                    if (editIndex >= 0 && editIndex < contactList.size()) {
                        Contact selectedContact = contactList.get(editIndex);
                        System.out.println("აირჩიეთ შესაცვლელი მონაცემი:");
                        System.out.println("1. სახელი");
                        System.out.println("2. გვარი");
                        System.out.println("3. ტელეფონი");
                        System.out.println("4. ელფოსტა");
                        System.out.print("აირჩიეთ: ");
                        int editOption = scanner.nextInt();

                        switch (editOption) {
                            case 1:
                                System.out.print("ახალი სახელი: ");
                                selectedContact.updateFirstName(scanner.next());
                                break;
                            case 2:
                                System.out.print("ახალი გვარი: ");
                                selectedContact.updateLastName(scanner.next());
                                break;
                            case 3:
                                System.out.print("ახალი ტელეფონი: ");
                                selectedContact.updatePhoneNumber(scanner.next());
                                break;
                            case 4:
                                System.out.print("ახალი ელფოსტა: ");
                                selectedContact.updateEmail(scanner.next());
                                break;
                            default:
                                System.out.println("არასწორი არჩევანი ");
                        }

                        try {
                            FileManager.saveToFile(contactList);
                            System.out.println("კონტაქტი განახლდა ");
                        } catch (IOException e) {
                            System.out.println("შეცდომა მონაცემების შენახვისას ");
                        }
                    } else {
                        System.out.println("არასწორი ნომერი ");
                    }
                    break;

                case 4:
                    if (contactList.isEmpty()) {
                        System.out.println("კონტაქტები არ მოიძებნა ");
                    } else {
                        for (int i = 0; i < contactList.size(); i++) {
                            System.out.println((i + 1) + " " + contactList.get(i));
                        }
                    }
                    break;

                case 5:
                    isRunning = false;
                    break;

                default:
                    System.out.println("არასწორი არჩევანი ");
            }
        }
        scanner.close();
    }
}
