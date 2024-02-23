import java.util.*;

class ABC extends Thread
{
	public void run()
	{
		System.out.println("This is thread");
	}
	
	public static void main(String ar[])
	{
		ABC ob=new ABC();
		ob.start();
	}
}