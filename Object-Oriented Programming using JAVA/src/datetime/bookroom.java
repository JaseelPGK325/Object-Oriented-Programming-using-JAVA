package datetime;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class bookroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the name");
String name=s.next();
System.out.println("Enter the Address");
String adr=s.next();
System.out.println("number of Room");
int nr=s.nextInt();
System.out.println("number person");
int np=s.nextInt();
System.out.println("AC or NonAC");
String ac=s.next();
System.out.println("Booking Date(yyyy-mm-dd)");
String start =s.next();// format yyyy-mm-dd
System.out.println("Checkout Date(yyyy-mm-dd)");
String end = s.next();
LocalDate ds = LocalDate.parse(start);
LocalDate de = LocalDate.parse(end);
long total = ChronoUnit.DAYS.between(ds,de);
String yes="";long cash=0;;

int nr1=Math.round(np/2);
if(nr==nr1) {
if(ac.equals("AC")&&np%2!=0) {
	yes="YES";
	cash=(total*1150*(nr-1));
	cash=cash+(1400*total);
}else if (ac.equals("AC")&&np%2==0){
	yes="YES";
	cash=(total*1150*nr);}
	else if(ac.equals("NonAC")&&np%2==0) {

	yes="NO";
	 cash=(total*1000*nr);
	}	
	
else if((ac.equals("NonAC")&&np%2!=0)) {
	yes="NO";
	 cash=(total*1000*(nr-1));
	 cash=cash+(1250*total);
}
else {
	System.out.println("please enter 'AC' or 'NonAC'");
}
}else {
	System.out.println("sorry");
}
System.out.println("Reg-Details :");
System.out.println("Name     : "+name);
System.out.println("Address  : "+adr);
System.out.println("No.of rooms : "+nr);
System.out.println("No.of guest : "+np);
System.out.println("AC         : "+yes);
System.out.println("No.of Days : "+total);
System.out.println("Amount : "+cash);



}



	

}
