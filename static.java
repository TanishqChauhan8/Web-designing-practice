import java.util.Scanner;

class ABC
{
	static int a=1;
	int b=0;
	
	void add(int k)
	{
		a=a+k;
		b=b+k;
	}
	
	void display()
	{
		System.out.println("Value of a : "+a);
		System.out.println("Vlaure of b : "+b);
	}
	
	public static void main(String ar[])
	{
		ABC ob=new ABC();
		ob.add(10);
		ob.display();
		System.out.println(a);
	}
}