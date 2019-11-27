package datetime;
import java.time.*;
public class cuuertdatetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Today Date");
	LocalDate d=LocalDate.now();//create date object
	System.out.println(d);//print today date
	System.out.println("\nCurrent Time");
	LocalTime t=LocalTime.now();//create time obj
	System.out.println(t);//print current time
	System.out.println("\ncurrent date and time");
	LocalDateTime dt=LocalDateTime.now();//create datetime obj
	System.out.println(dt);//print current date&time
	}

}
