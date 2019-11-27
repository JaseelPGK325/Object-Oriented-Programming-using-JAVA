package exceptionhandling;

public class finallys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[7];
			 a[9]=0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("java is oop language");
		}
	}

}
