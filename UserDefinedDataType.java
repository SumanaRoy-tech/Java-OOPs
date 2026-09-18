import java.util.*;

public class UserDefinedDataType {
    public static class Student { //amar data type 
    String name;
    int roll;
    double cgpa;

    void display(){
        System.out.println(name+" "+roll+" "+cgpa);
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student ();
        s1.name = "Sumana";
        s1.roll = 101;
        s1.cgpa = 8.2;

        Student s2 = new Student();
        s2.name = "Kutu";
        s2.roll = 105;
        s2.cgpa = 6.7;

        Student s3 = new Student();
        s3.name = "Pina";
        s3.roll = sc.nextInt();
        s3.cgpa = 7.8;

       // System.out.println(s1.name+" "+s1.roll+" "+s1.cgpa);
       // System.out.println(s3.roll);
       s1.display();
       s2.display();
       s3.display();
        sc.close();
    }

}
