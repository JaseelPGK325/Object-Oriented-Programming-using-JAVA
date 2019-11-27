package multithreading;

public class th1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
a.start();
}

}
class A extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Thread going to sleep "+i+" time");
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}System.out.println("Thread running "+i+" time");
		System.out.println(i);
		}
	}
	
}