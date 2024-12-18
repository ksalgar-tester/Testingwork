package basics;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Kshitij";
		
		for(int i=0; i<a.length();i++)
		{
			System.out.println(a.charAt(i)+" ");
		}
		
		
		
	System.out.println(a.replace("K", "S"));
	System.out.println(a.replaceAll("\\bKshitij\\b", "Shraddha"));
		
		
		
	}

}
