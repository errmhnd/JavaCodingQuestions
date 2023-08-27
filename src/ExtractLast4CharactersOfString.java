
public class ExtractLast4CharactersOfString {
	public static void main(String[] args) {
		String str = "Cheese";
		printLast4Characters(str);
	}

	public static void printLast4Characters(String str) {
		System.out.println(str.substring(Math.max(str.length() - 4, 0)));
	}
}