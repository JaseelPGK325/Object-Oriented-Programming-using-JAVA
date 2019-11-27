package string;

import java.util.Scanner;

public class insertreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
StringBuffer s=new StringBuffer(s1);
s.append("face");
s.insert(0, "for ");
s.delete(4,6);
s.replace(4, 7, "welcome");
s.deleteCharAt(5);
System.out.println(s);
	}

}
