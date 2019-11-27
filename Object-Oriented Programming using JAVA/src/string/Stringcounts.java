package string;
import java.util.*;
public class Stringcounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter your string");
String a=s.nextLine();
int spchar=0;
int countv=0;
int num=0;
int lower=0;
int sp=0;
int upper=0;
for (int i=0;i<a.length();i++) {
char ch=a.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
	countv++;
	}

 if(ch>=48&&ch<=57) {
	num++;
}
if(ch<='z'&&ch>='a') {
	lower++;
}if(ch==32) {
	sp++;
}if(ch<='Z'&&ch>='A') {
	upper++;
}if(ch<=47&&ch>=33||ch<=64&&ch>=58||ch<=126&&ch>=123||ch<=96&&ch>=91) {
	spchar++;
}
}
System.out.println("count of vowels             : "+countv);
int re=a.length()-countv;
System.out.println("count of remaining charas   : "+re);
System.out.println("count of digits             : "+num);
System.out.println("count of lowercase          : "+lower);
System.out.println("count of white spaces       : "+sp);
System.out.println("count of upper cases        : "+upper);

System.out.println("count of special characters : "+spchar);
	
	
	}
}
