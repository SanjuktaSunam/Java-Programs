import java.io.*;
	class SelectionS
		{
		     public static void main(String args[])throws IOException
			{ 
    				int i,j,temp,n;
				BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the size of array");
				n=Integer.parseInt(ob.readLine());
    				int a[]=new int[n];				
				System.out.println("Enter the elements");
				   for(i=0;i<n;i++)
				   {
				          a[i]=Integer.parseInt(ob.readLine());
				   }     
    				   for(i=0;i<n-1;i++) 
			                       {  
   				      for(j=i+1;j<n;j++) 
     			                           {
        				           if(a[i]>a[j]) 
            				             { 
                				                temp=a[i]; 
                				                a[i]=a[j]; 
                				                a[j]=temp;  
            				             } 
			                           }
    			                       } 
    				 System.out.println("The sorted array is "); 
    				   for(i=0;i<n;i++) 
    				       { 
        				          System.out.println(" "+a[i]); 
    				        } 
    			 
			}	 
	                   }  