package string;
import java.util.*;
public class carbike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("1)Car\n2)Bike");
int n=sc.nextInt();
StringBuffer s=new StringBuffer();
StringBuffer ss=new StringBuffer();
if(n==1) {
	System.out.println("Enter the details of car\nEnter the color");
	s.append("\nCar Details\n\nColor : "+sc.next());
	System.out.println("Enter the maximum speed");
	s.append("\nMax.speed : "+sc.nextInt());
	System.out.println("Enter the number of seats");
	s.append("\nNumber of Seats : "+sc.nextInt());
	System.out.println("Enter the number of wheels");
s.append("\nNumber of Wheels : "+sc.nextInt());
System.out.println("Enter the number of doors");
s.append("\nNumber of Doors :"+sc.nextInt());
System.out.println("Enter the status of AC(true/false)");
s.append("\nAc : "+sc.next());

}else if(n==2) {
	System.out.println("Enter the details of bike\nEnter the color");
	ss.append("\nCar Details\n\nColor : "+sc.next());
	System.out.println("Enter the maximum speed");
	ss.append("\nMax.speed : "+sc.nextInt());
	System.out.println("Enter the number of seats");
	ss.append("\nNumber of Seats : "+sc.nextInt());
	System.out.println("Enter the number of wheels");
ss.append("\nNumber of Wheels : "+sc.nextInt());
System.out.println("Enter the status of diskbreak(true/false)");
ss.append("\nDisk Break : "+sc.next());
}else {
	System.out.println("Invalid input");
}

System.out.println(s);
System.out.println(ss);
	}

}
