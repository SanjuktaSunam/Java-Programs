class Prime
	{
		public static void main(String args[])
		{
			int i,a,c=0;
			a=Integer.parseInt(args[0]);
			for(i=1;i<=a;i++)
			{
				if(a%i==0)
				c++;
			}
			if(c==2)
			System.out.println("prime no.");
			else
			System.out.println("not prime no.");
		}
	}