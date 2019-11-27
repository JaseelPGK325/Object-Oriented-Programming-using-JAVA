package encapsulation;
import java.util.Scanner;
public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Det ss=new Det();
System.out.println("Registration");
System.out.println("enter your name");
 ss.setName(s.nextLine());
System.out.println("enter your address");
ss.setAdd(s.nextLine());
System.out.println("enter contact no");
ss.setCont(s.nextLine());
System.out.println("enter email id");
ss.setEmail(s.nextLine());
System.out.println("enter proof type");
ss.setProof(s.nextLine());
System.out.println("enter proof id");
ss.setPid(s.nextLine());
System.out.println("Registration deatails");
System.out.println("----------------------");
ss.display(ss.getName(),ss.getAdd(),ss.getCont(),ss.getEmail(),ss.getProof(),ss.getPid());

}

}

