package basics;

public class LoopsDmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Loops are of 3 types:-
		//1.WHILE LOOP
		//2.DO WHILE LOOP
		//3.FOR LOOP 
		
		System.out.println("--WHILE LOOP--");
		
		int a=1;
		
		while(a<=10) //11<=10
		{
			System.out.println(a); //10
			a++; //10+1=11
		}
		
		System.out.println("--DO WHILE LOOP--");
		
		int b=1;
		
		do
		{
			System.out.println(b);
			b++;
		}
		while(b<=10);
		
		
		System.out.println("--FOR LOOP--");
		
	//     	
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		System.out.println("--REVERSE PRINT USING FOR LOOP--");
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
	}

}
