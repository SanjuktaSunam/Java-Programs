import java.io.*;
	class LinearS
	{
	     public static void main(String args[])throws IOException
		{
			int n,i,f=0,item,pos=0;
			BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the size of array");
			n=Integer.parseInt(ob.readLine());
			int a[]=new int[n];
			System.out.println("Enter the elements of array");
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(ob.readLine());
			}
			System.out.println("Enter the element to be searched");
			item=Integer.parseInt(ob.readLine());
			for(i=0;i<n;i++)
			{
				if(a[i]==item)
				{
					f=1;
					pos=i;
					
				}
				
			}
			if(f==1)
				System.out.println("Element is found at position "+pos);
			else
				System.out.println("Element is not found");
		}
	}