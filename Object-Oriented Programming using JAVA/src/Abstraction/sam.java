package Abstraction;
import java.util.Scanner;
public class sam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the name");
	String name=s.next();
	System.out.println("enter id");
	int id=s.nextInt();
	Stu a=new Stu();
	a.totalm(name,id);
	}

}
abstract class rank {
	 abstract void totalm(String name, int id); 
	public void rank1() {
System.out.println("Rank 2");
}}
class Stu extends rank{

	public void totalm(String name, int id) {
		// TODO Auto-generated method stub
		System.out.println("Name    : "+name);
		System.out.println("Stud.ID : "+id);
super.rank1();

	}
}