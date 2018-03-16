package Practice;

public class ReplaceCharacters {

	public static void main(String[] args) {

		String s="J(02)";
		s.replaceAll("[()]", "").replaceAll("[0-9]", "");
	}

}
