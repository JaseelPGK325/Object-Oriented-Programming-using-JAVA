package Polymorphism;
import java.util.Scanner;
public class MethodOverride {

	

	public static void main(String[] args) {
		Demo obj=new Demo();
		// TODO Auto-generated method stub

	}

}
class ABC
{

	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("parent class");
	}
	
	}
class Demo extends ABC{
	public void disp() {
	}{
		super.disp();
		System.out.println("child class");
	}

}