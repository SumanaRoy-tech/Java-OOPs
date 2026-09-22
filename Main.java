import java.util.*;

abstract class ElectricityConnection {
    int consumerId;
    String consumerName;
    double units;

    ElectricityConnection(int consumerId, String consumerName, double units) {
        this.consumerId = consumerId;
        this.consumerName = consumerName;
        this.units = units;
    }

    abstract double calculateBill();
}

interface BillOperations {
    void generateBill();

    void payBill();

    void cancelBill();
}

class DomesticConnection extends ElectricityConnection implements BillOperations {
    DomesticConnection(int consumerId, String consumerName, double units) {
        super(consumerId, consumerName, units);
    }

    @Override
    double calculateBill() {
        double rate = 5.0;
        return rate * units;
    }

    @Override
    public void generateBill()

    {
        double bill = calculateBill();
        double tax = 0.05 * bill;
        double totalBill = bill + tax;

        System.out.println("Domestic Connection");
        System.out.println("UserID: " + consumerId);
        System.out.println("User Name: " + consumerName);
        System.out.println("Units used: " + units);
        System.out.println("Bill: " + bill);
        System.out.println("Tax: " + tax);
        System.out.println("Total Bill: " + totalBill);

    }

    @Override
    public void payBill() {
        System.out.println("Domastic Bill paid successfully!");
    }

    @Override
    public void cancelBill() {
        System.out.println("Bill cancelled!");
    }
}

class CommercialConnection extends ElectricityConnection implements BillOperations {
    CommercialConnection(int consumerId, String consumerName, double units) {
        super(consumerId, consumerName, units);
    }

    @Override
    double calculateBill() {
        double rate = 8.0;
        return rate * units;
    }

    @Override
    public void generateBill() {
        double bill = calculateBill();
        double tax = 0.05 * bill;
        double totalBill = tax + bill;

        System.out.println("commertial Connection");
        System.out.println("UserID: " + consumerId);
        System.out.println("User Name: " + consumerName);
        System.out.println("Units used: " + units);
        System.out.println("Bill: " + bill);
        System.out.println("Tax: " + tax);
        System.out.println("Total Bill: " + totalBill);

    }

    @Override
    public void payBill() {
        System.out.println("Commercial Bill paid successfully!");
    }

    @Override
    public void cancelBill() {
        System.out.println("Bill canceled!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Consumer name: ");
        String name = sc.nextLine();
        System.out.println("Enter Units: ");
        double units = sc.nextDouble();

        System.out.println("1. Domestic");
        System.out.println("2.Commertial");
        System.out.println("Enter choice:");
        int choice = sc.nextInt();
        ElectricityConnection connection;

        if (choice == 1) {
            connection = new DomesticConnection(id, name, units);
        } else if (choice == 2) {
            connection = new CommercialConnection(id, name, units);
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }
        ((BillOperations) connection).generateBill();

        System.out.println("Want to pay? 1.Yes 2.Nope:");
        int ch = sc.nextInt();
        if (ch == 1) {
            ((BillOperations) connection).payBill();
        } else {
            ((BillOperations) connection).cancelBill();
        }
        sc.close();

    }
}
