package Abstraction;
import java.util.Scanner;
public class samp {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the name");
	String name=s.next();
	System.out.println("enter id");
	int id=s.nextInt();
	System.out.println("enter the total");
	int t=s.nextInt();
	Stu1 a=new Stu1();
	a.deti(name,id);
	a.tota(t);
	}
}
interface rank4{
	public void deti(String name,int id);
}
interface total{
	public void tota(int t);
}
class Stu1 implements rank4,total {
	 public void deti(String name, int id)
	    {
	        System.out.println("Name       -> "+name);
	        System.out.println("Student ID -> "+id);
	    }    
	    public void tota(int t) {
	        System.out.println("Total      -> "+t);
	}
}