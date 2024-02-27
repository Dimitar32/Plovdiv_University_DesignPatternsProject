package package1;

public class SweetShop {
	
	private static SweetShop uniqueInstance = null;
	
	private SweetShop() {}
	
	public static SweetShop getInstance() {
		return uniqueInstance == null ? new SweetShop() : uniqueInstance;
	}
	
	public CreateDessert newDessert(String yourDessert) {
		return new CreateDessert();
	}
	
}
