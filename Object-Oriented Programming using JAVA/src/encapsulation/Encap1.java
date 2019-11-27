package encapsulation;
import java.util.*;
public class Encap1 {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
regi ss=new regi();
System.out.println("Registration");
System.out.println("enter number");
ss.setNumber(s.nextInt());
System.out.println("enter your name");
 ss.setName(s.next());
System.out.println("enter your address");
ss.setAdd(s.next());
System.out.println("enter contact no");
ss.setCont(s.next());
System.out.println("enter email id");
ss.setEmail(s.next());
System.out.println("enter proof type");
ss.setProof(s.next());
System.out.println("enter proof id");
ss.setPid(s.next());
System.out.println("Registration deatails");
System.out.println("----------------------");
ss.display(ss.getNumber(),ss.getName(),ss.getAdd(),ss.getCont(),ss.getEmail(),ss.getProof(),ss.getPid());

	}

}
