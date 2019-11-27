package COREJAVA;
import java.util.*;
 class Boo 
 {
void availability() 
{
	System.out.println("available");
}
}
class Text extends Boo
{
void category() 
{
	System.out.println("novel");
	}
}
class Me extends Text 
{
void page(int a) 
{
	System.out.println("pages "+a);
}
}
public class Multilevel2 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("no.of pages");
	int a=s.nextInt();
	Me m=new Me();
	m.page(a);
	m.category();
	m.availability();
	}
}
