package string;
import java.util.*;
public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
StringBuffer s=new StringBuffer();
System.out.println("enter the name");
	s.append("Name     : "+sc.nextLine());
	System.out.println("enter id number");
	s.append("\nIDNumber : "+sc.next());
	System.out.println("enter age");
	s.append("\nAge      : "+sc.nextInt());
	System.out.println("enter position");
	s.append("\nPosition : "+sc.next());
	System.out.println(s);		
	}

}
