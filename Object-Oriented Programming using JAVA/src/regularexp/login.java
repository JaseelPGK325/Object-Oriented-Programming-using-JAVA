package regularexp;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter user name");
	String username=s.next();
	System.out.println("enter password");
	String password=s.next();
	Pattern p=Pattern.compile("@.");
	Matcher m=p.matcher("@j");
	boolean b=m.matches();
	System.out.println(b);
	
	
	}

}
