package string;
import java.util.*;
public class keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
char c[]= {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l',';','z','x','c','v','b','n','m',',','.','/'};
System.out.println("Enter L/R");
char cc=s.next().charAt(0);
System.out.println("enter String");
String str=s.next();
int l1=str.length();
int l2=c.length;
for(int i=0;i<l1;i++) {
	char cv=str.charAt(i);
	for(int j=0;j<l2;j++) {
	if(cv==c[j]&&cc=='R') {
		System.out.print(c[j-1]);
	}
	else if(cv==c[j]&&cc=='L')	{
		System.out.print(c[j+1]);
	}
}
	}

}
}