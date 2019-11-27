package encapsulation;

public class regi {
	int number;
	String name;
	String add;
	String cont;
	String email;
	String proof;
	String pid;
	int a=0,b=0,c=0;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name.matches("^[a-zA-Z]*$")) {
		
		this.name = name;
		a=0;
	}else{
		a=1;

	}}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getCont() {
		return this.cont;
	}
	public void setCont(String cont) {
		if(cont.matches("^[0-9]*$")) {
		
		this.cont = cont;
		b=0;
	}else{b=1;
		
		
	}}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		  if (email.contains("@")) {
		
		this.email = email;

		c=0;
	}
		  else{
			  c=1;
			 
				
			}
	}
	
	public String getProof() {
		return proof;
	}
	public void setProof(String proof) {
		this.proof = proof;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

public void display(int number,String name, String add, String cont, String email, String proof, String pid) {
	
		if(a==0&&b==0&&c==0) {System.out.println("SUCCESS");
		

		}
		else {
			if(a==1) {
				System.out.println("invalid name");
			}
			if(b==1) {System.out.println("invalid contact no");
			
			}
			if(c==1) {
				System.out.println("invalid mail");
			
			}
			System.out.println("Registration failed");
		}
		
		
				
	
	}

}
