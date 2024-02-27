package package1;

import java.util.Scanner;

public class CreateDessert {
	private Scanner scan;
	
	public CreateDessert() {
		this.scan = new Scanner(System.in);
	}
	
	public IceCream createIceCream() {
		System.out.println("Select type of IceCream: ");
		
		String type = scan.nextLine();
		try {
			return new IceCream(type);
		} catch (Exception e) {
			System.out.println("We have not got that type of ice cream");
			this.createIceCream();
			return null;
		}
	}
}
