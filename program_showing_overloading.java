class OverloadMethod
	{       
		void test()
		{	
		 System.out.println("No parameter");
		}
		void test(int a,int b)
		{
		 System.out.print("a and b "+a+" "+b);
		}
	}
class Overload
	{
		public static void main(String args[])
		{
			OverloadMethod ob=new OverloadMethod();
			ob.test();
			ob.test(10,20);
		}
	}