package COREJAVA;
import java.util.*;
class Car1{
	void about()
	{
		System.out.println("2020 model");
	}
	void name() {
		System.out.println("Toyota");
	}
}
	class Toyota extends Car1 {
		 void speed(int a) {
				System.out.println("speed -> "+a);
		}
	}
	public class Single {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the car speed");
		int a=s.nextInt();
		Toyota d=new Toyota();
		d.name();
		d.about();
		d.speed(a);
	}
}
