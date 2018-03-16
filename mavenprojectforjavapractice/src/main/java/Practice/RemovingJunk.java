package Practice;

public class RemovingJunk {

	public static void main(String[] args) {
		String s="@##234raghavendra g ;;;";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
