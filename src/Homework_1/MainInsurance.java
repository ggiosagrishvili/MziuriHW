package Homework_1;

public class MainInsurance {
    public static void main(String[] args) {
        Customer customer = new Customer("gio", "sagrishvili", 14, "123456789");

        Insurance autoInsurance = new AutoInsurance(20000, 3);
        Insurance healthCare = new HealthCare(14, 50000, true);
        Insurance travelInsurance = new TravelInsurance(10, 2, true);

        System.out.println("Auto Insurance ");
        customer.chooseInsurance(autoInsurance);

        System.out.println("Health Care");
        customer.chooseInsurance(healthCare);

        System.out.println("Travel Insurance ");
        customer.chooseInsurance(travelInsurance);
    }
}

