package COREJAVA;
import java.util.Scanner;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name");
		String str=s.next();
		Carnew c=new Carnew (str);
		Carnew.a();
		Carnew.b();
		Carnew.m();
		Carnew.disply(str);
	}}
	class Carnew{String str;
	public Carnew(String str) {
		str=str;
	}
	public static void m() {
		System.out.println("Welcome Car m");
		System.out.println("Welcome Car model 12342");
	}
	public static void b() {
		System.out.println("Welcome Car b");
		System.out.println("Welcome Car model jhjg");
	}
	public static void a() {
	System.out.println("Welcome Car a");
	System.out.println("Welcome Car model jguiu");
	}
	public static void disply(String str) {
		System.out.println(str);
	}
	}


