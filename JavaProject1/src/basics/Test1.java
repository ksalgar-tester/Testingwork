package basics;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String sentence = "Kshitij          is    an   Automation  Tester";
	        
	        // Use a regular expression to replace multiple spaces with a single space
	        String formattedSentence = sentence.replaceAll("\\s+", " ").trim();
	        
	        // Output the formatted sentence
	        System.out.println(formattedSentence);
	}

}
