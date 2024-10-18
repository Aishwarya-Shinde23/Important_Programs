package String_Programs;

public class ReverseWordInBetween {

	public static void main(String[] args) {
		String str = "I'm moving forward always"; 
		String result = " ";
		String replace = "forward";
		
		String [] s1 = str.split(" ");
		
		char[] ch = s1[2].toCharArray();
		
		for (int i = ch.length-1; i >= 0; i--) {
			result = result + ch[i];
		}

		System.out.println("Output is: " + str.replaceFirst(replace, result.trim()));
		
		
	}

}
