import java.io.*;
	class  Bubblesort
		{
		  public static void main(String args[])throws IOException
		  {
			int i,j,n,temp;	
			BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the size of array");
			n=Integer.parseInt(ob.readLine());
			int a[]=new int[n];
			System.out.println("Enter the elements of array");
			for(i=0;i<n;i++)
			{
			      a[i]=Integer.parseInt(ob.readLine());
			}
			for(i=0;i<n-1;i++)
			{
			         for(j=0;j<n-i-1;j++)
			         {
				if(a[j]>a[j+1])
				{
				     temp=a[j];
				      a[j]=a[j+1];
				      a[j+1]=temp;
				}
			         }
			}
			System.out.println("The arranged array is ");
			for(i=0;i<n;i++)
			{
			System.out.println(a[i]);
			}
		}
	                   }     