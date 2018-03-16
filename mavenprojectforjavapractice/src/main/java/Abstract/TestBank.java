package Abstract;

public class TestBank extends HDFCBank{

	public static void main(String[] args) {
		
		HDFCBank hd=new HDFCBank();
		hd.deposit();
		hd.withdraw();
		hd.loan();
		hd.security();
		
		Bank bank=new HDFCBank();
		bank.deposit();
		bank.withdraw();
		bank.loan();
		

		
	}

}
