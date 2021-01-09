import java.io.*;
	class Addition
	{
	   public static void main(String S[])throws IOException
	    {
		int a,b,i,j;
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Size of matrix A and B");
		a=Integer.parseInt(ob.readLine());
		b=Integer.parseInt(ob.readLine());
		int A[][]=new int[a][b];
		int B[][]=new int[a][b];
		int C[][]=new int[a][b];
		System.out.println("Matrix A");
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
			   A[i][j]=Integer.parseInt(ob.readLine());
			}
		}
		System.out.println("Matrix B");
		for(i=0;i<a;i++)	
		{
			for(j=0;j<b;j++)
			{
			   B[i][j]=Integer.parseInt(ob.readLine());
			}
		}
		for(i=0;i<a;i++)
		{
			for(j=0;j<b;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		System.out.println("Sum of matrix is");
		for(i=0;i<a;i++)
		{                    
			for(j=0;j<b;j++)
			{
				System.out.println(" "+C[i][j]);
			}
		}
	       }
	}