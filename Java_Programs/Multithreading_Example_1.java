package mypack;

class Test_Thread
{
	int c;
	public void count()
	{
		c++;
	}
}
public class Multithreading_Example_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Test_Thread t=new Test_Thread();
		Thread t1=new Thread(new Runnable()
				{
			       public void run()
			       {
			    	   for(int i=1;i<=6;i++)
			    	   {
			    		  t.count(); 
			    		  System.out.println("Vasi");
			    	   }
			    	   
			       }
				});
		Thread t2=new Thread(new Runnable()
		{
	       public void run()
	       {
	    	   for(int i=1;i<=2;i++)
	    	   {
	    		  t.count(); 
	    		  System.out.println("Krish");
	    	   }
	       }
		});
		t1.setPriority(10);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count : "+t.c);
	}

}
