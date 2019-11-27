package exceptionhandling;

public class nullpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String a=null;
			int b=a.length();
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}

	}

}
