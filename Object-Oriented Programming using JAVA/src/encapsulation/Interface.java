package encapsulation;
import java.util.Scanner;

public class Interface {

public static void main(String[] args) {

Scanner s=new Scanner(System.in);
System.out.println("enter your name");
String name=s.next();
System.out.println("enter your address");
String address=s.next();
System.out.println("enter your contact no");
int cno=s.nextInt();
System.out.println("email ID");
String email=s.next();
System.out.println("enter prooftype");
String typ=s.next();
System.out.println("enter proof id");
String id=s.next();

Custom s1=new Custom();

s1.display1(name,address,cno,email,typ,id);
s1.update(name,address,cno,email,typ,id);
}
}




interface showdisp
{
public void display1(String name,String address,int cno,String email,String typ,String id);


}
interface uptodate
{
public void update(String name,String address,int cno,String email,String typ,String id);

}
 class Custom implements showdisp ,uptodate{
public void display1(String name,String address,int cno,String email,String typ,String id)

{
int i=0;

  System.out.println("Name        : "+name);
  System.out.println("Address     : "+address);
  System.out.println("Cont.No     : "+cno);
  System.out.println("E-Mail      : "+email);
  System.out.println("Proof type  : "+typ);
  System.out.println("Proof id    : "+id);
      System.out.println("Thank you for registering "+i);

}

public void update(String name, String address, int cno, String email, String typ, String id)
{
Scanner s=new Scanner(System.in);
System.out.println("Do you want to continue registration?(y/n)");
String pr = s.next();
if (pr.equals("n")==true || pr.equals("y")==true)
{
System.out.println("Do you want to update the email id?(y/n)");
  String ye=s.next();
  if(ye.equals("y")==true) {
  System.out.println("Update Email");
  System.out.println("Enter new Email id:");
String email1=s.next();
email=email1;
  System.out.println("Email updated");
}
  System.out.println("Your details are as follows");
  System.out.println("Name      : "+name);
  System.out.println("Address   : "+address);
  System.out.println("Cont.No   : "+cno);

  System.out.println("E-Mail    : "+email);
  System.out.println("Proof type: "+typ);
  System.out.println("Proof id  : "+id);

}

}
 }
