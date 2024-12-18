package basics;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//even odd 
		
		int a=3;
		
		if(a%2==0) //1==0 ..false
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
	//	% - modulus 
			
		int c=90, d=90;
		
		
		if(c<d) //90 < 90
		{
			System.out.println(d+" is greater than "+c);
		}
		else if(c>d) //90> 90
		{
			System.out.println(c+" is greater than "+d);
		}
		else if(c==d) //90==90
		{
			System.out.println("Both are equals..");
		}
		
		
		
		
	}

}
