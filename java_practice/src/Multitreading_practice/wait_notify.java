package Multitreading_practice;
class simple
{
	void waitforsignals() throws InterruptedException{
		synchronized(this)
		{
			System.out.println("waiting");
			wait();
			
			System.out.println("resume");
		}
	}
	void givesignals()
	{
		synchronized(this)
		{
			notify();
		}
	}
}
public class wait_notify {

	public static void main(String[] args) {
		simple s=new simple();
		Thread t1=new Thread(()->
		{
			try {
				s.waitforsignals();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		});
		Thread t2=new Thread(()->{
			try {
				Thread.sleep(5000);
				s.givesignals();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		});

	}

}
