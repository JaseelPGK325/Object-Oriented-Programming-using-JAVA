package regularexp;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regandlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s= new Scanner(System.in);

String firstnameformat="[A-Z][a-z]*";
String lastnameformat="[A-Z]+([ '-][a-zA-Z]+)*";
String emailformat = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
String regnoformat="[0-9]*";
String rankformat="[0-9]*";
String yearformat="[0-9]*";
String deptformat="^[A-Z.]*+([\\s][A-Z]+)*$";

Pattern pname1=Pattern.compile(firstnameformat);
Pattern pname2=Pattern.compile(lastnameformat); 
Pattern pemail=Pattern.compile(emailformat);
Pattern preg=Pattern.compile(regnoformat);
Pattern prank=Pattern.compile(rankformat);
Pattern pyear=Pattern.compile(yearformat);
Pattern pdept=Pattern.compile(deptformat);

System.out.println("enter first name");
String name1=s.next();
System.out.println("enter last name");
String name2=s.next();
System.out.println("enter email id");
String email=s.next();
System.out.println("enter registration no");
String reg=s.next();
System.out.println("enter rank");
String rank=s.next();
System.out.println("enter year");
String year=s.next();
System.out.println("enter department");
String dept=s.next();

Matcher fnm=pname1.matcher(name1);
Matcher lnm=pname2.matcher(name2);
Matcher em=pemail.matcher(email);
Matcher regm=preg.matcher(reg);
Matcher rm=prank.matcher(rank);
Matcher ym=pyear.matcher(year);
Matcher dm=pdept.matcher(dept);

if(fnm.matches()) {
	if(lnm.matches()) {
		if(em.matches()) {
			if(regm.matches()) {
				if(rm.matches()) {
					if(ym.matches()) {
						if(dm.matches()) {
							System.out.println("user name : "+email);
							String pwformat="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})";
							Pattern ppw = Pattern.compile(pwformat);
							System.out.println("enter password : ");
							String pw=s.next();
							Matcher pwm=ppw.matcher(pw);
							if(pwm.matches()) {
								System.out.println("successfully login");
							}
							else {
								System.out.println("invalid password");
							}
							
						}else {
							System.out.println("invalid department");
						}
					}else {
						System.out.println("invalid year");
					}
				}else {
					System.out.println("invalid rank");
				}
			}else {
				System.out.println("invalid reg no");
			}
		}else {
			System.out.println("invalid email");
		}
	}else {
		System.out.println("invalid last name");	
	}
	
}
else {
	System.out.println("invalid first name");
}






	}

}
