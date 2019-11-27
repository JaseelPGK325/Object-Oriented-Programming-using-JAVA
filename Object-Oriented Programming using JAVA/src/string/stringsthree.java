package string;
import java.util.*;
public class stringsthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
String s4="";
System.out.println("enter first string");
String s1=s.next();

System.out.println("enter second string");
String s2=s.next();
System.out.println("enter third string");
String s3=s.next();
char v[]=s1.toCharArray();
char c[]=s2.toCharArray();
for(int i=0;i<v.length;i++) {
	if(v[i]=='a'||v[i]=='u'||v[i]=='o'||v[i]=='i'||v[i]=='e'||v[i]=='U'||v[i]=='O'||v[i]=='I'||v[i]=='E'||v[i]=='A') {
		v[i]='$';
	}System.out.print(v[i]);
}for(int i=0;i<c.length;i++) {
	if(c[i]=='a'||c[i]=='u'||c[i]=='o'||c[i]=='i'||c[i]=='e'||c[i]=='U'||c[i]=='O'||c[i]=='I'||c[i]=='E'||c[i]=='A') {
		c[i]=c[i];
	}else {
		c[i]='#';
	}
	System.out.print(c[i]);

	
}
	
	s3=s3.toUpperCase();
	

System.out.print(s3);
	}

}
