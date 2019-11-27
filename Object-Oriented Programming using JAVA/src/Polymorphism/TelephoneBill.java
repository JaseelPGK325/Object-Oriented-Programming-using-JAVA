package Polymorphism;
import java.util.Scanner;
public class TelephoneBill {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        tele c=new tele();
        System.out.println("Enter the Telephone Bill Number :");
        int n=s.nextInt();
            System.out.println("Enter the Customer Name :");
            String n1=s.next();
            System.out.println("Enter the Number of Calls made :");
            int n2=s.nextInt();
            System.out.println("Enter the Cost per Call :");
            double n3=s.nextDouble();
            System.out.println("Enter the Current Bill Number :");
            int n4=s.nextInt();
            System.out.println("Enter the Customer Name :");
            String n5=s.next();
            System.out.println("Enter the Number of Units Consumed :");
            int n6=s.nextInt();
            System.out.println("Enter the Cost per Unit :");
            double n7=s.nextDouble();
            
            c.displayDetails(n,n1,n2,n3,n4,n5,n6,n7);
            
        
       
        }
  
}
class tele{
    public void displayDetails(int n,String n1, int n2, double n3, int n4, String n5,int n6,double n7) {
        // TODO Auto-generated method stub
        System.out.println("      Telephone Bill");
        System.out.println("---------------------------");
        System.out.println("Bill Number          : "+n);
        System.out.println("Customer Name        : "+n1);
        System.out.printf("Telephone Bill Amount: %.1f ",(n2*n3));
        System.out.println("\n\n       Current Bill ");
        System.out.println("----------------------------");
        System.out.println("Bill Number          : "+n4);
        System.out.println("Customer Name        : "+n5);
        System.out.printf("Current Bill Amount  : %.1f ",(n6*n7));
        
    }
}
