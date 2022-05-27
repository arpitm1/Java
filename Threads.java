//package Multithreading;
public class Threads
{
	 public static void main(String[] args)
	{
		NameThread nt = new NameThread();
		Thread t = new Thread(nt);
		t. setName("fred");
		t. start();
		//t. run();
	}
}
	 class NameThread implements Runnable
	 {
	 public void run()
	 {
		 System.out.println("Runnable Running");
		 System.out.println("Run by"+ Thread.currentThread());
		 
	 }
	
	 }
