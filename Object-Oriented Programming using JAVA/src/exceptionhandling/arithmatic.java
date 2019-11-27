package exceptionhandling;

public class arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a[]=new int[7];
	a[4]=40/0;
}catch(ArithmeticException e){
	System.out.println(e);
}
	}

}
