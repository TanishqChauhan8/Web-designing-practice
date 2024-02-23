import java.util.*;

class ABC extends Thread
{
	public void run()
	{
		for(int i=1;i<60;i++)
		{
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	
	public static void main(String ar[])
	{
		ABC ob=new ABC();
		ob.start();
	}
}