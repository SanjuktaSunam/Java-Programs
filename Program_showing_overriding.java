class Vehicle
	{
		void run()
		{
		 System.out.print("Vehicle is running");
		}
	}
class Bike extends Vehicle
	{
		void run()
		{
		 System.out.print("Bike is running safely");
		}
	   public static void main(String args[])
	   {
	       Vehicle obj=new Vehicle();
	       obj.run();
		Bike obj1=new Bike();
		obj1.run();
	   }
        }
