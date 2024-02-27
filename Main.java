package package1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SweetShop sweetShop = SweetShop.getInstance();
		
		System.out.println("Choose your dessert: ");
		String dessert = scan.nextLine();
		
		CreateDessert i = sweetShop.newDessert(dessert);
		IceCream ic = i.createIceCream();
		
		System.out.println("Do you want additives?");
		String s = scan.nextLine();
		
		while(s.equals("yes")) {
			System.out.println("Choose additive: ");
			String additive = scan.nextLine();

			if(additive.equals("syrop")) {				
				ic.addAdditives(new SyropAdditive());
			}
			if(additive.equals("Chocolate Sticks")) {
				ic.addAdditives(new ChocolateSticksAdditive());
			}
			System.out.println("Do you want more additives?");
			s = scan.nextLine();
		}
		
		System.out.println("Your ice cream price is: " + ic.getPriceIcecream());
		
		scan.close();
	}


}
