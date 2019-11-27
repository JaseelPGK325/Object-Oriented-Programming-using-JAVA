package string;
import java.util.*;


public class carbikebufferpoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

System.out.println("1)Car\n2)Bike");
Car c=new Car();
Bike b=new Bike();
int n=sc.nextInt();
switch(n)
{
case 1:
    
    c.displayDetails();
    break;
case 2:
  
    b.displayDetails();
    break;
    default:
    System.out.println("Invalid input");
}
}
}
class Car{
	Scanner sc=new Scanner(System.in);
	StringBuffer s=new StringBuffer();
			public void displayDetails() {
// TODO Auto-generated method stub
System.out.println("Enter the details of car");
System.out.println("Enter the color");
s.append("\nCar Details\n\nColor       : "+sc.next());
System.out.println("Enter the maximum speed");
s.append("\nMax Speed   : "+sc.nextInt());
System.out.println("Enter the number of seats");
s.append("\nNo.of Seats : "+sc.nextInt());
System.out.println("Enter the number of wheels");
s.append("\nNo.of Wheels: "+sc.nextInt());
System.out.println("Enter the number of doors");
s.append("No.of doors :  "+sc.nextInt());
System.out.println("Enter the status of AC(true/false)");
s.append("\nAC          : "+sc.next());
System.out.println(s);

}
}
class Bike{
	Scanner sc=new Scanner(System.in);
	StringBuffer s=new StringBuffer();
public void displayDetails() {
// TODO Auto-generated method stub
	System.out.println("Enter the details of bike");
    System.out.println("Enter the color");
    s.append("\nBike Details\n\nColor       : "+sc.next());
    System.out.println("Enter the maximum speed");
    s.append("\nMax Speed   : "+sc.nextInt());
    System.out.println("Enter the number of seats");
    s.append("\nNo.of Seats : "+sc.nextInt());
    System.out.println("Enter the number of wheels");
  s.append("\nNo.of Wheels: "+sc.nextInt());
    System.out.println("Enter the status of diskbreak(true/false)");
    s.append("\nDisk Break  : "+sc.next());




System.out.println(s);
}

}
