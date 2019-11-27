package COREJAVA;
import java.util.Scanner;

public class Casestudy2 {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int choice;
Case2 b=new Case2();
String pr;
do {
System.out.println("******MENU*****");
System.out.println("1.Booking");
System.out.println("2.CHECK STATUS");
System.out.println("3.EXIT");
System.out.println("Enter Your Choice");
choice=sc.nextInt();

switch(choice)
{
case 1:
{
b.book();
break;
}
case 2:

b.status();
break;
case 3:
System.exit(0);
break;
default:
System.out.println("Select correct input");
}
System.out.println("Do you want to continue");
pr=sc.next();
}while(pr.equals("yes"));


}
}