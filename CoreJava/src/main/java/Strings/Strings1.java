package strings;

public class Strings1 {
	String str1 = "we work to live and live to be happy live";
	String word1 = "live";

	public static void check(String str, String word) {
		String s[] = str.split(" ");
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (word.equals(s[i])) {
				count++;
			}
			System.out.println(count);
		}
	}
}