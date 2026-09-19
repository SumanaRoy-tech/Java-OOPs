
import java.util.*;

class BankAccount {
    int acc_no;
    String name;
    double balance;

    BankAccount(int a, String n, double b) {
        this.acc_no = a;
        this.name = n;
        this.balance = b;
    }

    void balanceEnquiry() {
        System.out.println("The account number is " + this.acc_no);
        System.out.println("The account holder name is " + this.name);
        System.out.println("The balance is " + this.balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int a, String n, double b) {
        super(a, n, b);
    }

    void deposit(double amt) {
        this.balance += amt;
        System.out.println("The amount is deposited");
    }

    void withdrawal(double amt) {
        if (amt > this.balance) {
            System.out.println("The given amount cannot be withdrawn");
        } else {
            System.out.println("The amount is withdrawn");
            this.balance -= amt;
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(int a, String n, double b) {
        super(a, n, b);
    }

    void deposit(double amt) {
        this.balance += amt;
        System.out.println("The amount is deposited");
    }

    void withdrawal(double amt) {
        if (amt > this.balance) {
            System.out.println("The given amount cannot be withdrawn");
        } else {
            System.out.println("The amount is withdrawn");
            this.balance -= amt;
        }
    }
}

class bankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account number:");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the account holder name:");
        String n = sc.nextLine();
        System.out.print("Enter the balance:");
        double b = sc.nextDouble();
        CurrentAccount ca = new CurrentAccount(a, n, b);
        SavingsAccount sa = new SavingsAccount(a, n, b);
        System.out.println(
                "Choice 1: Deposit in Current Account\nChoice 2: Deposit in Savings Account\nChoice 3: Withdrawal in Current Account\nChoice 4: Withdrawal in Savings Account\nChoice 5: Display Savings Account\nChoice 6: Display Current Account\nChoice 7: Exit\n and Other choice:Invalid\n");
        while (true) {
            System.out.print("Enter the choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount(Current Account):");
                    double dc = sc.nextDouble();
                    ca.deposit(dc);
                    break;
                case 2:
                    System.out.print("Enter the deposit amount(Savings Account):");
                    double ds = sc.nextDouble();
                    sa.deposit(ds);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount(Current Account):");
                    double wc = sc.nextDouble();
                    ca.withdrawal(wc);
                    break;
                case 4:
                    System.out.print("Enter the withdrawal amount(Savings 0Account):");
                    double ws = sc.nextDouble();
                    sa.withdrawal(ws);
                    break;
                case 5:
                    System.out.println("Savings Account");
                    sa.balanceEnquiry();
                    break;
                case 6:
                    System.out.println("Current Account:");
                    ca.balanceEnquiry();
                    break;
                case 7:
                    System.out.println("Exiting\n");
                    return;
                default:
                    System.out.println("Invalid Choice\n");
                    break;
            }
        }
    }
}