package mypack;

class Employee_A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hai, i'm Vamsi");
			try {
				Thread.sleep(i*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Employee_B extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hai, i'm Krishna");
			try {
				Thread.sleep(i*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Multithreading_Example_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Employee_A e=new Employee_A();
		Employee_B b=new Employee_B();
		e.start();
		e.stop();
		b.start();
		e.join();
		b.join();
		System.out.println("Done...");
	}

}
