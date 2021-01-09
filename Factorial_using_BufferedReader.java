import java.io.*;
	class Fact
	{
	  public static void main(String args[])throws IOException
	  {
		int i,n,fact=1;
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a no.");
		n=Integer.parseInt(ob.readLine());
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial value is= "+fact);
	   }
	}