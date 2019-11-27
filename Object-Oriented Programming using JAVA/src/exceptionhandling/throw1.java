package exceptionhandling;

public class throw1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
int a=12;
int v=19;
if(a>v) 
	throw new ArithmeticException("a grater");
	else
		throw new ArithmeticException("v grater");
}
	}