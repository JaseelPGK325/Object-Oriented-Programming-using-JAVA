package regularexp;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class emailpaswwordvalid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String emailformat = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
Pattern pwformat= Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
Pattern pattern = Pattern.compile(emailformat);
System.out.println("enter email ID");
String email=s.next();
Matcher em=pattern.matcher(email);
System.out.println("enter password");
	String password=s.next();
	Matcher pwm=pwformat.matcher(password);
	if(em.matches()) {
		System.out.println("Valid email");
	}else {
		System.out.println("invalid mail");
	}if(pwm.matches()) {
		System.out.println("valid password");
	}else {
		System.out.println("invalid password");
	}
	
	}

}
