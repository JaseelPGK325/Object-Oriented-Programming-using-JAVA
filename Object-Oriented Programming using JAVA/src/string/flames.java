package string;
import java.util.*;
public class flames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String flm="flames";
int num;
System.out.println("enter first name");
String name1=s.nextLine();
System.out.println("enter second name");
String name2=s.nextLine();
name1=name1.toLowerCase();
name2=name2.toLowerCase();
int length1=name1.length();
int length2=name2.length();
char n1[]=name1.toCharArray();
char n2[]=name2.toCharArray();
for(int i=0;i<length1;i++)
{  
 for(int j=0;j<length2;j++)
 {
  if(n1[i]==n2[j])
  {
   n1[i]='*';
   n2[j]='*';
   break;
  }
 }
}
String tname=new String(n1);
tname=tname+(new String(n2));
tname=tname.replace("*","");
int tl=tname.length();
System.out.println(tl);

for(int k=6;k>=2;k--)
{
 if(tl>k) {
 num=tl-k;}
 else {
  num=tl;
 } 
 
 while(num>k)
 {
  num=num-k;
 } 
 
 flm=flm.substring(num,flm.length())+(flm.substring(0,num-1)); 
}

switch(flm.charAt(0))
{
 case 'f': System.out.println("Relationship = Friends"); break;
 case 'l': System.out.println("Relationship = Lovers"); break;
 case 'a': System.out.println("Relationship = Affections"); break;
 case 'm': System.out.println("Relationship = Married"); break;
 case 'e': System.out.println("Relationship = Enemy"); break;
 case 's': System.out.println("Relationship = Siblings"); break;
}

}
}