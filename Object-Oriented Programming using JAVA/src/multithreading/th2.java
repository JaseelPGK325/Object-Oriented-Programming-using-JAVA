package multithreading;

public class th2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car t=new car();
car1 t1=new car1();
car2 t2=new car2();
t.start();
t1.start();
t2.start();
	}

}
class car extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			if(i==1)yield();
			System.out.println("car A running "+i);
		}System.out.println("car A running complete");
	}
}
class car1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			if(i==2)stop();
			System.out.println("car B running "+i);
				
		}System.out.println("car B running");
	}
}
class car2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			if(i==3) {
				try {
					System.out.println("car A running sleep");
					Thread.sleep(10000);
				}catch(InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}
}