import java.io.*;
	interface Cal
	{
		public void area();
		float pi=3.14f;
	}
	class Arectangle implements Cal
	{
		public void area(int l,int b)
		{
		   System.out.println("Area of rectangle is"+l*b);
		}
	}
	class Asquare implements Cal
	{
		public void area(int s)
		{
		   System.out.println("Area of square is"+s*s);
		}
	}
	class Acircle implements Cal
	{
		public void area(int r)
		{
		   System.out.println("Area of circle is"+pi*r*r);
		}
	}
	class Final
	{
		public static void main(String args[])throws IOException
		{                   
			int x,y,z,q;
			BufferedReader ab=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter length and breadth");
			x=Integer.parseInt(ab.readLine());
			y=Integer.parseInt(ab.readLine());
			System.out.println("Enter side for square");
			z=Integer.parseInt(ab.readLine());
			System.out.println("Enter radius for circle");
			q=Integer.parseInt(ab.readLine());
			Arectangle ob=new Arectangle();
			ob.area(x,y);
			Asquare obj=new Asquare();
			obj.area(z);
			Acircle obje=new Acircle();
			obje.area(q);
		}
	}