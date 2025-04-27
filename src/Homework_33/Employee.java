package Homework_33;

import java.util.*;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return name + " - $" + salary;
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.getName().compareTo(e1.getName());
    }
}

class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("გიორგი", 5000));
        employees.add(new Employee("ნიკა", 7000));
        employees.add(new Employee("ანა", 6000));

        Collections.sort(employees);
        System.out.println("Sorted by Salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        employees.sort(new NameComparator());
        System.out.println("Sorted by Name:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Employee maxSalaryEmployee = Collections.max(employees);
        Employee minSalaryEmployee = Collections.min(employees);
        System.out.println("Max Salary Employee: " + maxSalaryEmployee);
        System.out.println("Min Salary Employee: " + minSalaryEmployee);

        Collections.reverse(employees);
        System.out.println("Reversed List:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}