import java.util.Scanner;

class Area
{
	int a,b,h;
	float d1,d2;
	void area(int a,int b)
	{
		this.a=a;
		this.b=b;
		int A=(this.b*this.a);
		System.out.println("Area of Parallegram - "+A);
	}
	
	void area(float d1,float d2)
	{
		this.d1=d1;
		this.d2=d2;
		float A=((1.0f/2.0f)*(this.d1)*(this.d2));
		System.out.println("Area of Rohmbus - "+A);
	}
	
	void area(int h)
	{
		int a=10;
		int b=20;
		this.h=h;
		double A=((1.0/2.0)*(a+b)*(this.h));
		System.out.println("Area of Trapezium - "+A);
	}
	
	public static void main(String ar[])
	{
		Area ob=new Area();
		ob.area(10,20);
		ob.area(11.0f,10.0f);
		ob.area(10);
	}
}