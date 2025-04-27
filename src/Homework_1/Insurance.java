package Homework_1;

public interface Insurance {
    String companyName = "Best Insurance Company";
    void packageInfo();
}

class AutoInsurance implements Insurance {
    private double carPrice;
    private int carAge;

    public AutoInsurance(double carPrice, int carAge) {
        this.carPrice = carPrice;
        this.carAge = carAge;
    }

    @Override
    public void packageInfo() {
        double insuranceCost;
        if (carAge < 5) {
            insuranceCost = carPrice * 0.05;
        } else {
            insuranceCost = carPrice * 0.08;
        }
        System.out.println("Auto Insurance Package:");
        System.out.println("Company: " + companyName);
        System.out.println("Car Price: " + carPrice);
        System.out.println("Car Age: " + carAge + " years");
        System.out.println("Insurance Cost: " + insuranceCost);
    }
}

class HealthCare implements Insurance {
    private int age;
    private double income;
    private boolean wantsInternationalCoverage;

    public HealthCare(int age, double income, boolean wantsInternationalCoverage) {
        this.age = age;
        this.income = income;
        this.wantsInternationalCoverage = wantsInternationalCoverage;
    }

    @Override
    public void packageInfo() {
        double baseCost = income * 0.03;
        if (wantsInternationalCoverage) {
            baseCost *= 1.2;
        }
        System.out.println("Health Care Package:");
        System.out.println("Company: " + companyName);
        System.out.println("Age: " + age);
        System.out.println("Income: " + income);
        System.out.println("International Coverage: " + (wantsInternationalCoverage ? "Yes" : "No"));
        System.out.println("Insurance Cost: " + baseCost);
    }
}

class TravelInsurance implements Insurance {
    private int days;
    private int people;
    private boolean wantsBaggageInsurance;

    public TravelInsurance(int days, int people, boolean wantsBaggageInsurance) {
        this.days = days;
        this.people = people;
        this.wantsBaggageInsurance = wantsBaggageInsurance;
    }

    @Override
    public void packageInfo() {
        double baseCost = days * people * 10;
        if (wantsBaggageInsurance) {
            baseCost *= 1.1;
        }
        System.out.println("Travel Insurance Package:");
        System.out.println("Company: " + companyName);
        System.out.println("Days: " + days);
        System.out.println("People: " + people);
        System.out.println("Baggage Insurance: " + (wantsBaggageInsurance ? "Yes" : "No"));
        System.out.println("Insurance Cost: " + baseCost);
    }
}

class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private String personalId;

    public Customer(String firstName, String lastName, int age, String personalId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personalId = personalId;
    }

    public void chooseInsurance(Insurance insurance) {
        System.out.println("Customer: " + firstName + " " + lastName);
        insurance.packageInfo();
    }
}
