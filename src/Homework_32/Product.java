package Homework_32;
import java.util.ArrayList;
import java.util.List;

class Product {
    public String name;  // ცვლადის სახელი n შევცვალე name-ზე, რომ იყოს უფრო გასაგები.
    public double price; // ცვლადის სახელი p შევცვალე price-ზე.

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart {
    List<Product> productList = new ArrayList<>();  // ცვლადის სახელი list შევცვალე productList-ზე, რომ იყოს უფრო გასაგები.

    public void add(Product product) {
        productList.add(product);
    }

    public double calculateTotal() {  // calc() მეთოდი შევცვალე calculateTotal()-ზე, რომ იყოს უფრო გასაგები.
        double total = 0;
        for (Product product : productList) { // for loop სტილი შევცვალე foreach-ზე, რაც კოდს უფრო მარტივს ხდის.
            total += product.price;
        }
        return total;
    }

    public void display() {
        System.out.println("Items:");
        for (Product product : productList) {  // შეცდომა: p.p უნდა ყოფილიყო "product.price"
            System.out.println(product.name + product.price);
        }
        System.out.println("Total: " + calculateTotal());  //  calc() უნდა ყოფილიყო "calculateTotal()"
    }
}

class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();  // შეცდომა: ShoppingCart sc გადავარქვი cart, რომ უფრო გასაგები იყოს.

        cart.add(new Product("Laptop", 1200.50));
        cart.add(new Product("Phone", 800.75));
        cart.add(new Product("Mouse", 25.99));

        System.out.println(cart); // შეცდომა: System.out.println() არ იყო გამოყენებული, რაც საჭიროა შედეგების გამოსატანად.
    }
}
