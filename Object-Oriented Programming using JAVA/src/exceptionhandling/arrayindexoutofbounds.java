package exceptionhandling;

public class arrayindexoutofbounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a[]=new int[7];
	 a[9]=0;
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
}
	}

}
