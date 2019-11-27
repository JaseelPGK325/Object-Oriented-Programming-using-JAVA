package multithreading;

import java.util.Scanner;

public class welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
word s=new word();
s.start();
	}

}
class word extends Thread{
	Scanner sc=new Scanner(System.in);
	public void run() {
		System.out.println("enter string");
		String a=sc.next();
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
		
		try {
			System.out.println(c);
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	
	}
}}