import java.io.*;
	class Searching
	{
	   public static void main(String S[])throws IOException
	   {
		int i,j,m,n,item,b=0,d=0,e=0;
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Size of matrix");
		m=Integer.parseInt(ob.readLine());
		n=Integer.parseInt(ob.readLine());
		int A[][]=new int[m][n];
		System.out.println("Elements of matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				A[i][j]=Integer.parseInt(ob.readLine());
			}
		}
		System.out.println("Enter element to be searched");
		item=Integer.parseInt(ob.readLine());
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(item==A[i][j])
				{
					b=1;
					d=i;
					e=j;
				}
			}
		}
		if(b==1)
		{
			System.out.println("Element found at A["+d+"] ["+e+"]");
		}
		else
		{
			System.out.println("Element not found");
		}
	                  }
	}