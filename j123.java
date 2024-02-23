import java.util.*;

class NewError extends Exception
{
	String error="";
	NewError(String ar)
	{
		error=ar+"Password does not meet requirements";
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
			String pw=new String();
			String e=new String();
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Password : ");
			pw=sc.nextLine();
			int c1=0,c2=0,c3=0,c4=0,c5=0;
			if(pw.length()>=8)
			{
				for(int i=0;i<pw.length();i++)
				{
					char ch=pw.charAt(i);
					if(Character.isUpperCase(ch))
						c1++;
					else if(Character.isLowerCase(ch))
						c2++;
					else if(Character.isDigit(ch))
						c3++;
					else if(Character.isWhitespace(ch))
						c4++;
					else
						c5++;
				}
				
				if(c1>=1 && c2>=1 && c3>=1 && c4>=1 && c5>=1)
				{
					System.out.println("Password inputed is correct");
				}
				else
				{
					throw(new NewError(e));
				}
			}
			else
			{
				throw(new NewError(e));
			}
		}
		
		catch(NewError e)
		{
			System.out.println(e);
		}
	}
}
			
						
				
				