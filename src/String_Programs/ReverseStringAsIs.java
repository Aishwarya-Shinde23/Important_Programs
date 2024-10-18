package String_Programs;

public class ReverseStringAsIs {

	public static void main(String[] args) {
		String str = "Welcome to Capegemini";

		String a[] = str.split(" ");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}
