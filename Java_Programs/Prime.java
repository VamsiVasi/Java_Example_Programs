package mypack;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int n = s.nextInt(); 
	       int temp=n,flag=0;
	       if(n<=1)
	       {
	    	   System.out.println("The Number : "+temp+" is not a prime");
	    	   flag=1;
	       }
	       else
	       {
	    	   for(int i=2;i<Math.sqrt(n);i++)
	           {
	        	   if(n%i==0)
	        	   {
	        		   System.out.println("The Number : "+temp+" is not a prime");
	        		   flag=1;
	        		   break;
	        	   }
	           }
	       }
	       if(flag==0)
	       {
	    	   System.out.println("The Number : "+temp+" is a prime");
	       } 
	}

}
