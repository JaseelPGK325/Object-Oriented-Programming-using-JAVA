package string;
import java.util.*;
public class person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
StringBuffer s=new StringBuffer();
System.out.println("Registraion\n");
System.out.println("Enter your name");
	s.append("Your details are as follows \n\nName      : "+sc.nextLine());
	System.out.println("Enter your address");
	s.append("\nAddress   : "+sc.nextLine());
	System.out.println("Contact Number");
	s.append("\nContact No: "+sc.nextInt());
	System.out.println("E-Mail ID");
	s.append("\nE-Mail ID : "+sc.next());
	
	System.out.println("Enter proof type");
	s.append("\nproof type: "+sc.next());
	System.out.println("Enter proof id");
	s.append("\nproof id  : "+sc.next());
	System.out.println("\nThank you for registering. Your id is 1..\n");
	
	
	System.out.println(s);		
	}

}
