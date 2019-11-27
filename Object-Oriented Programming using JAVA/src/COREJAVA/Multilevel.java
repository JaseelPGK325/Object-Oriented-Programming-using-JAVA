package COREJAVA;
import java.util.*;
 class Car2 {
void availability() {
	System.out.println("available in market");
}
}
class Audi extends Car2 {
void category() 
{
	System.out.println("Car");}
}
class Model extends Audi {
void name(int a) {
	System.out.println("audi "+a);
}
}
public class Multilevel {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("model");
	int a=s.nextInt();
	Model m=new Model();	
	m.category();
	m.name(a);
	m.availability();
	}
}
