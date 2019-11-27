package string;
import java.util.*;
public class Stringsample {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter your string");
		String a=s.nextLine();//enter string
		String aa[]=a.split(" ");//string array
		for(int i=0;i<aa.length;i++) {

			if(i%2==0) {
				System.out.print(aa[i]+" ");//print odd position string
			}else {
				String rev="";
				for(int j=aa[i].length()-1;j>=0;j--) {
					char c=aa[i].charAt(j);
					rev=rev+c;
				
			}
				System.out.print(rev+" ");//print reversed strings
				}
			
		}
}
}
