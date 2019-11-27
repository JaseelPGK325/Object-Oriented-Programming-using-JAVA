package string;
import java.util.*;
public class stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter first string");
String a=s.nextLine();//first string
System.out.println("enter second string");
String b=s.nextLine();//second string
System.out.println("enter third String");
String c=s.nextLine();//third string
System.out.println("\n length of string 1 : "+a.length()+" \n length of string 2 : "+b.length()+" \n length of string 3 : "+c.length());
	System.out.println();
	char aa= a.charAt(5);//5th character in String 1
	System.out.println("5th character in String 1 : "+aa);
	String b1=b.substring(3, 7);//substring of second string that starts with position 3 and ends at 7
	System.out.println("substring of second string : "+b1);
	boolean c1=c.startsWith("the");//is third string starts with 'the' true or false printed
	System.out.println("third string starts with 'the' : "+c1);
	int a1=a.indexOf("he");//the index of 'he' in first string
	System.out.println("the index of 'he' in first string :"+a1);
	System.out.println("resultant string by adding string 1&string 3 : "+a.concat(c));//concat first and third
	System.out.println("string 2 after replacement of 't' by 'T' : "+b.replace("t", "T"));//replacing 
	String bb[]=b.split(" ");//string array
	System.out.println("string 2's splitting : ");
	for(int i=0;i<bb.length;i++) {
		System.out.println(bb[i]);//stored in string 
	}
	System.out.println();//next line
	boolean bc=b.equals(c);// string 2&3 are equal or not?
	System.out.println("is string 2&string 3 are equal : "+bc);
	System.out.println("string 3 to lowercase : "+c.toLowerCase());//string 3 to lowercase
	System.out.println("string 2 to uppercase : "+b.toUpperCase());//string 2 to uppercase
	}

}
