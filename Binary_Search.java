import java.io.*;
	class BinaryS
		{
			public static void main(String args[])throws IOException
			{
			 	int beg=0,end,n,i,item,f=0,mid;
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
				end=n-1;	
				mid=(beg+end)/2;
				while(beg<=end)
				{
					if(item==a[mid])
					  {      f=1;
					        System.out.println("Element is found");
					        break;
					    }
					else if(item<a[mid])
					    {
					        end=mid-1;
					    }
					else
					    {
					      beg=mid+1;
					     }
					mid=(beg+end)/2;
				}
				
				if(f==0)
				         {
					System.out.println("Element not found");
				          }			
			}
		}