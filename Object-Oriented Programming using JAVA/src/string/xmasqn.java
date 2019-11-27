package string;
import java.util.*;
public class xmasqn {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("enter guest's name");
			String str1 = s.next();
			System.out.println("name of the residence host");
			String str2 = s.next();
			System.out.println("letters in a pile that were found at the door in the morning");
			String str = s.next();
			if(str1.length()+str2.length()==str.length()) {
				str1=str1+str2;
				char[] ch1=str1.toCharArray();
	char [] ch=str.toCharArray();
	 Arrays.sort(ch);
     String sorted=new String(ch);
     Arrays.sort(ch1);
     String sorted1=new String(ch1);
     if(sorted.equals(sorted1)) {
    	 System.out.println("YES");
     }else {
    	 System.out.println("NO");
     }
			}
				

	else {
System.out.println("NO");
}
}
}