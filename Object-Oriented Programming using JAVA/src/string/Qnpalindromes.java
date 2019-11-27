package string;
import java.util.*;
public class Qnpalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter string");
	String str=s.next();
	System.out.println("Enter the number of palindromes in the string");
	int n=s.nextInt();
	int l=str.length();
	String rev="";
	String rev1="";
	int count=0;
	int co=0;
	if(n==2) {
	
	for(int i=1;i<=l/2;i++) {
	
		char c=str.charAt(i);
		rev=rev+c;
	}
	for(int j=(l/2);j>=1;j--) {
		char d=str.charAt(j);
		rev1=rev1+d;
	}
	if(rev.equals(rev1)) {
		count++;
		}else {
			count=count;
		}
	
	for(int j=l/2+1;j<=l;j++) {
		char v=str.charAt(j);
		rev=rev+v;}
	for(int i=l;i>=(l/2)+1;i--) {
		char d=str.charAt(i);
		rev1=rev1+d;
	}
		if(rev.equals(rev1)) {
			co++;
		}
		else {
			co=co;
		}
	}
	
	
	int cc=co+count;
	if(cc==n) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}

}}