import java.util.Scanner;

public class RemovingVowelsFromString extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the word:");
		String word = scanner.nextLine();

		String result = removeEvenVowels(word);

		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String removeEvenVowels(String word) {

		String result = "";

		for (int i = 0; i < word.length(); i++) {

			char c = word.charAt(i);

			if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') && i % 2 != 0)
				continue;

			result += c;
		}

		return result;

	}

}
