package Polymorphism;

import java.util.Scanner;

public class Poly {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number 1");
int n1=s.nextInt();
System.out.println("enter number 2");
int n2=s.nextInt();
System.out.println("enter number 3");
int n3=s.nextInt();

Add a=new Add();
a.add(n1);
a.add(n1,n2);
a.add(n1,n2,n3);


	}

}
class Add {

	public void add(int n1) {
		// TODO Auto-generated method stub
		System.out.println("first number >> "+n1);
	
	}

	public void add(int n1, int n2, int n3) {
		// TODO Auto-generated method stub
		System.out.println("sum of 3 numbers >> "+(n1+n2+n3));
	}

	public void add(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.println("sum of first  and second number >> "+(n1+n2));
	}
	

}