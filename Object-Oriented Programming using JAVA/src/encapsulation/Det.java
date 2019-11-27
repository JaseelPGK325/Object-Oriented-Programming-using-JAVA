package encapsulation;

public class Det {
// TODO Auto-generated method stub
			String name;
			String add;
			String cont;
			String email;
			String proof;
			String pid;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getAdd() {
				return add;
			}
			public void setAdd(String add) {
				this.add = add;
			}
			public String getCont() {
				return cont;
			}
			public void setCont(String cont) {
				this.cont = cont;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
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
			public void display(String name, String add,String cont,String email,String proof,String pid) {
				// TODO Auto-generated method stub
				System.out.println("Name     : "+name);
				System.out.println("add      : "+add);
				System.out.println("cont no  : "+cont);
				System.out.println("email    : "+email);
				System.out.println("Proof    : "+proof);
				System.out.println("Proof id : "+pid);

				
				System.out.println("Thank you for registering. Your Id is 1..");
				
			}
			
			
	}

