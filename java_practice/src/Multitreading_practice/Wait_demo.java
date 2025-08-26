package Multitreading_practice;
class Shared{
	int num;
	boolean ready=false;
	
	synchronized void produce(int n) {
		if(ready) return;
		num=n;
		System.out.println("produces:"+num);
		ready=false;
		notify();
	}
	synchronized void consume() {
		while(!ready) {
			try { wait();} catch(Exception e) {}
		}
		System.out.println("consumed:"+num);
	}
	
}
public class Wait_demo {

	public static void main(String[] args) {
		Shared s=new Shared();
		new Thread(() -> s.produce(6)).start();
		new Thread(() -> s.consume()).start();

	}

}
