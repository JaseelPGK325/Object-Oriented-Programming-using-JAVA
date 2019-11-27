package COREJAVA;
import java.util.*;
public class Operatins {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number 1");
	int n1=s.nextInt();
	System.out.println("Enter Number 2");
	int n2=s.nextInt();
	System.out.printf("1)add\n2)sub\n3)mul\n");
	int n=s.nextInt();
	Oper c=new Oper(n1,n2);
switch (n)
{case 1: Oper.add(n1,n2);
break;
case 2: Oper.sub(n1,n2);
break;}
	}

}
class Oper{int n1,n2;
public Oper(int n1,int n2) {
	n1=n1;
	n2=n2;
	}
	

public static void add(int n1,int n2) {
	System.out.printf("add-> %d",n1+n2);
}
public static void sub(int n1,int n2) {
	System.out.printf("sub-> %d",n1-n2);}
}