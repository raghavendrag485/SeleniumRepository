package Abstract;

public abstract class Bank {
	
	public void deposit(){
		System.out.println("deposit");
	}
	public void withdraw(){
		System.out.println("withdraw");
	}
	public abstract void loan();

}
