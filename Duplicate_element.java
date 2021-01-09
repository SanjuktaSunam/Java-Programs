import java.io.*;
class Duplicate
	{
	    public static void main(String args[])throws IOException
	    {
		int i,j,n;
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");
		n=Integer.parseInt(ob.readLine());
		String a[]=new String[n];
		System.out.println("Enter elements of array");
		for(i=0;i<n;i++)
		{
			a[i]=(String)ob.readLine();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i].compareTo(a[j])==0)
				{
					System.out.println("Duplicate element  "
						+a[j]+"  at "+j);
				}
			}
			
		}
		
	    }
	}