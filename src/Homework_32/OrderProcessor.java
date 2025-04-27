package Homework_32;

public class OrderProcessor {
    public void processOrder(String customerName, String address, String product, int quantity) {
        double price;

        if (product.equalsIgnoreCase("Laptop")) { // შეცდომა: equals() equalsIgnoreCase(), რათა რეგისტრის პრობლემა არ იყოს
            price = 1000.0;
        } else if (product.equalsIgnoreCase("Phone")) {
            price = 500.0;
        } else if (product.equalsIgnoreCase("Tablet")) {
            price = 300.0;
        } else {
            price = 0.0; // თუ პროდუქტი უცნობია, ფასი ნულოვანი უნდა იყოს
        }

        double total = price * quantity;
        double discount = 0;

        if (total > 5000) {
            discount = total * 0.1; // 10%-იანი ფასდაკლება
        } else if (total > 2000) { // შეცდომა: 2000  უნდა იყოს "total > 2000", რათა 2000-ზე არ დაემთხვეს ფასდაკლებას.
            discount = total * 0.05; // 5%-იანი ფასდაკლება
        }

        total -= discount;


        System.out.println("Order Summary:");
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + address);
        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Price after Discount:", total);
    }

    public static void main(String[] args) {
        OrderProcessor op = new OrderProcessor();
        op.processOrder("Alice", "123 Main St", "Laptop", 6);
    }
}
