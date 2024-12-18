package basics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		//call          execute
		
		System.out.println("Enter any 3 numbers:-");
		System.out.println("Enter the 1st Number:- ");
		int a=sc.nextInt(); //nextInt() is predefined method of Scanner class
	   
		System.out.println("Enter the 2nd Number");
		int b=sc.nextInt();
		
		System.out.println("Enter the 3rd Number");
	    int c=sc.nextInt();
	    System.out.println("Addition "+(a+b+c));
	    
	    
	    
	    
		

	}

}
