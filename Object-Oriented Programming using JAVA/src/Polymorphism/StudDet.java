package Polymorphism;

import java.util.Scanner;


public class StudDet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter name");
String name=s.nextLine();
System.out.println("enter student id");
String id=s.next();
System.out.println("enter mark in maths");
int a=s.nextInt();
System.out.println("enter mark in science");
int b=s.nextInt();
System.out.println("enter mark in language");
int c=s.nextInt();
double av = (a+b+c)/3;
sd d=new sd();
System.out.println("Student Progress Card");
System.out.println("_____________________");
System.out.println("Name         : "+name);
System.out.println("Stud.ID      : "+id);

d.total(a,b,c);
d.avg(av);
d.rank(a,b,c);

	}

}
 class sd {

	public void total(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("Total marks  : "+(a+b+c));
		
	}

	public void avg(double av) {

		System.out.printf("Average marks: %.2f\n",av);
		// TODO Auto-generated method stub
		
	}

	public void rank(int a, int b, int c) {
		if((a+b+c)>=250&&(a+b+c)<=300) {
			System.out.println("Rank         : 1");
		}
		else if((a+b+c)<250&&(a+b+c)>=200) {
			System.out.println("Rank         : 2");
		}
		else if((a+b+c)>=150&&(a+b+c)<200) {
			System.out.println("Rank         : 3");
		}
		else if((a+b+c)<150) {
			System.out.println("Failed");
	
			}
		else {
			
			System.out.println("you entered invalid marks. Maximum marks in any subject is only 100.please check the marks you enterd");
	
		}
		
		// TODO Auto-generated method stub
		
	}

	
 }
	