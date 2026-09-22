import java.util.*;

abstract class MedicalService{
    int serviceId;
    String serviceName;
    double cost;

    MedicalService(int serviceId, String serviceName, double cost ){
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.cost = cost;
    }

    abstract double calculateBill();
}

interface ServiceOperations{
    void bookService(); 
    void cancelService();
    void completeService();
}

class Consultation extends MedicalService implements ServiceOperations{
    Consultation(int serviceId, String serviceName, double cost){
        super(serviceId, serviceName, cost);
    }
    @Override 
    public double calculateBill(){
        return cost + (cost * 0.10);
    }
    @Override 
    public void bookService(){
        System.out.println("Consultation booked!");
    }
    @Override 
    public void cancelService(){
        System.out.println("Consultaion Canceled!");
    }
    @Override 
    public void completeService(){
        System.out.println("Consultation done successfully!");
    } 
}
class LabTest extends MedicalService implements ServiceOperations{
    LabTest(int serviceId, String serviceName, double cost){
        super(serviceId, serviceName, cost);
    }
    @Override 
    public double calculateBill(){
        return cost + (0.20*cost);
    }
    @Override 
    public void bookService(){
        System.out.println("Lab test booked!");
    }
    @Override 
    public void cancelService(){
        System.out.println("Test book cancelled!");
    }
    @Override 
    public void completeService(){
        System.out.println("Lab test completed!");
    }
}

class Medicine extends MedicalService implements ServiceOperations{
    Medicine(int serviceId, String serviceName, double cost){
        super(serviceId, serviceName, cost);
    }
    @Override 
    public double calculateBill(){
        return cost + (0.05*cost);
    }
    @Override 
    public void bookService(){
        System.out.println("Medicine booked!");
    }
    @Override 
    public void cancelService(){
        System.out.println("Medicine cancelled!");
    }
    @Override 
    public void completeService(){
        System.out.println("Medicine arrived!");
    }
}

public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter the cost: ");
        double cost = sc.nextDouble();
        System.out.println("1.Consultation");
        System.out.println("2.Lab Test");
        System.out.println("3.Medicine");

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        MedicalService service;

        if(choice==1){
            service = new Consultation(id, name, cost);
        }
        else if(choice==2){
            service = new LabTest( id, name, cost);
        }
        else if(choice == 3){
            service = new Medicine(id, name, cost);
        }
        else{
            System.out.println("Invalid choice!");
            sc.close();
            return ;
        }
        double bill = service.calculateBill();
        double gst = 0.05* bill;
        double totalBill = bill + gst; 

        System.out.println("Hospital Bill");
        System.out.println("ID: " + id);
        System.out.println("Name: "+ name);
        System.out.println("Cost: "+cost);
        System.out.println("Bill: " + bill);
        System.out.println("Gst: "+ gst);
        System.out.println("Total Bill: "+ totalBill);

        ServiceOperations operations = (ServiceOperations) service; 
        operations.bookService();
        operations.completeService();

        System.out.println("You want to cancel the service? 1. Yes 2.No!");
        int ch = sc.nextInt();
        if(ch == 1){
            operations.cancelService();
        }
        sc.close();
        return ;
    }
}
