package exceptionhandling;

public class numberformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
String s="abc";
int i=Integer.parseInt(s);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
	}

}
