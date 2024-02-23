class ABC
{
	int p;
	void perimeter(int s)
	{
		p=4*s;
		System.out.println("Perimeter of Square - "+p);
	}
	
	void perimeter(int l,int b)
	{
		p=2*(l+b);
		System.out.println("perimeter of Rectangle - "+p);
	}
	
	void perimeter(float r)
	{
		float p=(2*(22.0f/7.0f)*r);
		System.out.printf("Perimeter of Circle - %.2f",p);
	}
	
	public static void main(String ar[])
	{
		ABC ob=new ABC();
		ob.perimeter(2);
		ob.perimeter(2,3);
		ob.perimeter(2.0f);
	}
}