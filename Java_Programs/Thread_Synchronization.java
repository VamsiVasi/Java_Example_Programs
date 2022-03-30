package mypack;

class Test_Thread
{
	int c;
	public synchronized void count()
	{
		c++;
	}
}
public class Thread_Synchronization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Test_Thread t=new Test_Thread();
		Thread t1=new Thread(new Runnable()
				{
			       public void run()
			       {
			    	   for(int i=1;i<=200;i++)
			    	   {
			    		  t.count(); 
			    	   }
			    	   
			       }
				});
		Thread t2=new Thread(new Runnable()
		{
	       public void run()
	       {
	    	   for(int i=1;i<=200;i++)
	    	   {
	    		  t.count(); 
	    	   }
	       }
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count : "+t.c);
	}

}
