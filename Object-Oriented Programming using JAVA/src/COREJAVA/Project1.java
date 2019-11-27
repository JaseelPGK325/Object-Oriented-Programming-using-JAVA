package COREJAVA;
import java.util.*;
public class Project1 {
public static void main(String args[]) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter your name");
	String name=s.next();
	System.out.println("enter your rollno");
	int rollno=s.nextInt();
	System.out.println("enter your mark in malayalam");
	float i=s.nextFloat();
	System.out.println("enter your mark in english");
	float j=s.nextFloat();
	System.out.println("enter your mark in science");
	float k=s.nextFloat();
	System.out.println("enter your mark in social");
	float l=s.nextFloat();
	System.out.println("enter your mark in maths");
	float m=s.nextFloat();
	float tot,avg;
	tot=i+j+k+l+m;
	avg=tot/5;
	System.out.println("Name    :"+name);
	System.out.println("Roll no :"+rollno);
	System.out.println("=========================");
	System.out.println("Malayalam :"+i);
	System.out.println("English   :"+j);
	System.out.println("Science   :"+k);
	System.out.println("Social    :"+l);
	System.out.println("Maths     :"+m);
	System.out.println("==========================");
	System.out.println("Total marks   :"+tot);
	System.out.println("Average marks :"+avg);
	
	
	}
}
