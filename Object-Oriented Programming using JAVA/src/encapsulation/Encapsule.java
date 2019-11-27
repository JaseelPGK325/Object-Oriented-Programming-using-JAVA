package encapsulation;
import java.util.*;
public class Encapsule {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
Stud st=new Stud();
System.out.println("enter your id");
	st.setId(s.nextInt());
System.out.println("enter your name");
st.setName(s.next());
System.out.println("Student Details");
System.out.println("Name : "+st.getName());
System.out.println("ID   : "+st.getId());
}
	}

class Stud {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
