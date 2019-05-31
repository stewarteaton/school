package sep26;

public class TokensTest {

	public static void main(String[] args) {
		String str = "one two three four";
		String[] words = str.split(" ");
		
		for(String s : words)
			System.out.println(s);
		
		System.out.printf("There are %d words in the string\n", words.length);
			
	}

}
