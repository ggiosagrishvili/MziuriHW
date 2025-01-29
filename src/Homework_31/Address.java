//package Homework_31;
//import java.util.*;
//
//class Address {
//    String country;
//    String city;
//    String street;
//    String building;
//
//
//    public Address(String country, String city, String street, String building) {
//        this.country = country;
//        this.city = city;
//        this.street = street;
//        this.building = building;
//    }
//    public String toString() {
//        return country +  city +  street + building;
//    }
//}
//
//class Employee {
//    String firstName;
//    String lastName;
//    String id;
//    double salary;
//
//
//    public Employee(String firstName, String lastName, String id, double salary) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.id = id;
//        this.salary = salary;
//    }
//}
//
//class Corporation {
//    String name;
//    Address address;
//    HashMap<String, String> contacts = new HashMap<>();
//    ArrayList<Employee> employees = new ArrayList<>();
//
//    public Corporation(String name, Address address) {
//        this.name = name;
//        this.address = address;
//    }
//
//    void addContact(String type, String number) {
//        contacts.put(type, number);
//    }
//
//    void addEmployee(Employee employee) {
//        employees.add(employee);
//    }
//
//    String aboutUs() {
//        return "Address: " + address + "Contacts: " + contacts;
//    }
//
//    public class CorporationApp {
//        public static void main(String[] args) {
//            try {
//                Corporation corp = new Corporation("gio", new Address("georgia", "tiblisi", "c.dadiani", "65"));
//                corp.addContact("office", "121212121212");
//                corp.addEmployee(new Employee("gela", "alaal", "12345678901", 5000));
//
//                System.out.println(corp.aboutUs());
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//}
