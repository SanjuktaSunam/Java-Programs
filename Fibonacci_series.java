import java.io.*;
class Fibonacci
	{
	          public static void main(String args[])throws IOException
	               {
		int a=0,b=1,i,c,n;
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the range");
		n=Integer.parseInt(ob.readLine());
		System.out.println("Fibonacci series");
		for(i=2;i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	                }
	}









