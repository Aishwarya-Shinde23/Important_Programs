package Basic_Java_Programs;

public class DemoJava {

	public static void manin(String[] args) {

		String str = "Sample String";
		int length = str.length();
		if (length >= 2) {
			System.out.println("Second Last String is : " + str.charAt(length - 2));
		} else {
			System.out.println("Invalid String");
		}
	}

}


