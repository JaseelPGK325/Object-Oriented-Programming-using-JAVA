package datetime;
import java.util.Calendar;
public class calenders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar c=Calendar.getInstance();
System.out.println("At present calendar's year : "+c.get(Calendar.YEAR));
	System.out.println("At present calendar's day : "+c.get(Calendar.DATE));
	System.out.println("the current date is : "+c.getTime());
	c.add(Calendar.DATE, -7);
	System.out.println("7 days ago : "+c.getTime());
	c.add(Calendar.MONTH, 11);
	System.out.println("11 months later : "+c.getTime());
	c.add(Calendar.YEAR, 9);
	System.out.println("9 Years later : "+c.getTime());
	
	}

}
