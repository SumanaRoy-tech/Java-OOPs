import java.util.Scanner;

interface Product {
    double calculatePrice();

    void displayProduct();
}

class Electronics implements Product {
    int productId;
    String productName;
    double price;

    Electronics(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        double discount = price * 0.10; // 10% discount
        return price - discount;
    }

    @Override
    public void displayProduct() {
        System.out.println("\n--- Electronics ---");
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount     : 10%");
        System.out.println("Final Price  : ₹" + calculatePrice());
    }
}

class Clothing implements Product {
    int productId;
    String productName;
    double price;

    Clothing(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        double discount = price * 0.20; // 20% discount
        return price - discount;
    }

    @Override
    public void displayProduct() {
        System.out.println("\n--- Clothing ---");
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount     : 20%");
        System.out.println("Final Price  : ₹" + calculatePrice());
    }
}

class Grocery implements Product {
    int productId;
    String productName;
    double price;

    Grocery(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        double discount = price * 0.05; // 5% discount
        return price - discount;
    }

    @Override
    public void displayProduct() {
        System.out.println("\n--- Grocery ---");
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount     : 5%");
        System.out.println("Final Price  : ₹" + calculatePrice());
    }
}

public class Shopping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Product Category:");
        System.out.println("1. Electronics");
        System.out.println("2. Clothing");
        System.out.println("3. Grocery");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        Product product;

        if (choice == 1) {
            product = new Electronics(id, name, price);
        } else if (choice == 2) {
            product = new Clothing(id, name, price);
        } else if (choice == 3) {
            product = new Grocery(id, name, price);
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        product.displayProduct();

        sc.close();
    }
}