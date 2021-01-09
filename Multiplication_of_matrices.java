import java.io.*;
	class Multiplication
	{
	   public static void main(String S[])throws IOException
	   {
		int i,j,m,n,o,p,s,k;
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Size of matrix1");
		m=Integer.parseInt(ob.readLine());
		n=Integer.parseInt(ob.readLine());
		System.out.println("Size of matrix2");
		o=Integer.parseInt(ob.readLine());
		p=Integer.parseInt(ob.readLine());
		int A[][]=new int[m][n];
		int B[][]=new int[o][p];
		int C[][]=new int[m][p];
		System.out.println("Matrix A");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				A[i][j]=Integer.parseInt(ob.readLine());
			}
		}
		System.out.println("Matrix B");
		for(i=0;i<o;i++)
		{
			for(j=0;j<p;j++)
			{
				B[i][j]=Integer.parseInt(ob.readLine());
			}
		}
		if(n==o)
		{
			for(i=0;i<m;i++)
			{
				for(j=0;j<p;j++)
				{
					C[i][j]=0;
				   for(k=0;k<n;k++)
				    {
					C[i][j]=C[i][j]+A[i][k]*B[k][j];
				    }
				}
			}
		}
		System.out.println("Multiplied matrix is");
		for(i=0;i<m;i++)
		{
			for(j=0;j<p;j++)
			{
				System.out.println(" "+C[i][j]);
			}
		}
	    }
	}