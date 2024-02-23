import java.util.*;

class emailError extends Exception
{
	String error="";
	
	emailError(String ar)
	{
		error=ar+" Doesn't Satisfy All Conditions, So Invalid Email ";
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
			String e=new String();
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Email id : ");
			e=sc.nextLine();
			int c=0;
			for(int i=0;i<e.length();i++)
			{
				if(e.charAt(i)=='@')
					c++;
			}
			if(c==1 && e.endsWith(".com"))
				System.out.println("Its a valid email id ");
			else
				throw(new emailError(e));
		}
		catch(emailError e)
		{
			System.out.println(e);
		}
	}
}