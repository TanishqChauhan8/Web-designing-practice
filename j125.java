import java.util.*;

class NewError extends Exception
{
	String error="";
	NewError(String ar)
	{
		error=ar+" Does Not meet Admission Requirements";
	}
	
	public String toString()
	{
		return error;
	}

}

class ABC
{
	public static void main(String ar[])
	{
		try
		{
			String q=new String();
			String e=new String();
			int p,age;
			Scanner sc=new Scanner(System.in);
			System.out.println("  ------Admission Eligibilty Check-------  ");
			System.out.print("Enter yes if you are 12th qualified otherwise No : ");
			q=sc.nextLine();
			if(q.equals("No"))
				throw(new NewError(e));
			System.out.print("Enter your %age : ");
			p=sc.nextInt();
			if(p<90)
				throw(new NewError(e));
			System.out.print("Enter Your Age : ");
			age=sc.nextInt();
			if(age<18)
				throw(new NewError(e));
			System.out.println("You are Eligible for Admission");
		}
		catch(NewError e)
		{
			System.out.println(e);
		}
	}

}				