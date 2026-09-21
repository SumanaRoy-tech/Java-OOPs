import java.util.*;

interface Payment {
    void makePayment(double amount);
}

class CreditCard implements Payment {
    public void makePayment(double amount) {
        System.out.println("payment method: Credit Card");
        System.out.println("Amount paid: " + amount);
    }
}

class UPI implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment Method: UPI");
        System.out.println("Amount Paid: " + amount);
    }
}

class NetBanking implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment Method: Net Banking");
        System.out.println("Amount Paid: " + amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount for credit card: ");
        double amount1 = sc.nextDouble();

        System.out.println("Enter the amount for UPI: ");
        double amount2 = sc.nextDouble();

        System.out.println("Enter amount for Net Banking: ");
        double amount3 = sc.nextDouble();

        Payment p1 = new CreditCard();
        Payment p2 = new UPI();
        Payment p3 = new NetBanking();

        System.out.println("\n---payment Details---");

        p1.makePayment(amount1);
        p2.makePayment(amount2);
        p3.makePayment(amount3);

        sc.close();
    }
}
