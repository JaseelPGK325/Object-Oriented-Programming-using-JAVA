package encapsulation;
import java.util.Scanner;
public class ticketencap {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
        tic cc=new tic();
        int i=1,a;double total=0,ss=0;
System.out.println("enter price of ticket");
cc.setPrice(s.nextInt());
System.out.println("enter no of person");
cc.setP(s.nextInt());
a=cc.getP();

do {
System.out.printf("Enter the details Person %d\n",i);i++;
System.out.println("enter name");
cc.setName(s.next());
System.out.println("enter gender(F/M)");
cc.setG(s.next());
System.out.println("enter age");
cc.setAge(s.nextInt());
cc.addmember(cc.getName(),cc.getAge(),cc.getG(),cc.getP());

total=cc.totalprice(cc.getAge(),cc.getG(),cc.getPrice(),cc.getP(),ss);

ss=total;

if(a==1)
{
cc.ticket5(cc.getPrice(),cc.getP(),ss);
cc.display(cc.getP());
}
a--;
}while(a>0);

}

}
 class tic {
int price;
int p;int i=0,j=1;
String name;
String g;
int age;
String per[]=new String[25];
String ge[]=new String[25];
int ag[]=new int[25];

double total=0,sum=0;
public int getPrice() {
return price;
}
public void tic(int price2, int p2, double ss) {
	// TODO Auto-generated method stub
	
}
public double totalprice(int age2, String g2, int price2, int p2, double ss) {
	// TODO Auto-generated method stub
	return 0;
}
public void ticket5(int price2, int p2, double ss) {
	// TODO Auto-generated method stub
	
}
public void setPrice(int price) {
this.price = price;
}
public int getP() {
return p;
}
public void setP(int p) {
this.p = p;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getG() {
return g;
}
public void setG(String g) {
this.g = g;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
void addmember(String name,int age,String g,int p)
{

per[i]=name;
ag[i]=age;
ge[i]=g;
i++;
}
void display(int p) {
int k=1;
for(i=0;i<p;i++)
{
System.out.printf("%d)%s(%s %d)\n",k,per[i],ge[i],ag[i]);
k++;
}
}}
