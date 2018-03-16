package InterFace;

public class Benz implements Car {

	

	public void start() {

		System.out.println("Car Started");
		
	}

	public void stop() {
		System.out.println("Car stopped");
		

		
	}

	public void fuel() {
		System.out.println("car refulled");

		
	}

	
	public static void main(String[] args) {
		
		
		Benz benz=new Benz();
		benz.start();
		benz.stop();
		benz.fuel();

	}
}
