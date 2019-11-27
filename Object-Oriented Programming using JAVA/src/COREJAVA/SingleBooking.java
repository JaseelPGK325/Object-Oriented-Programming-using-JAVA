package COREJAVA;
import java.util.*;
class Season {
void tot(int n,int d,int th) {
	int j=n*d*th;
	System.out.println("Hotel tariff "+j+" Rupees");
}
}
class total extends Season{}
public class SingleBooking {
	public static void main(String[] args) {
		System.out.println("Booking\n No.of persons");
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		System.out.println("No.of days");
		int d=s.nextInt();
		System.out.println("Room type");
		String r=s.next();
		System.out.println("Tariff per person");
		int th=s.nextInt();
		total st=new total();
		st.tot(n,d,th);
	}

}
