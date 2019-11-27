package datetime;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDateTime dt=LocalDateTime.now();
System.out.println("Before formatting : "+dt);
DateTimeFormatter format=DateTimeFormatter.ofPattern("E, YYYY-MMM-dd, hh:mm:ss ");
String formatdate=dt.format(format);
System.out.println("After Formatting : "+formatdate);
	}

}
