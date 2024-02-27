package package1;

public class IceCream {
	private String type;
	private double priceIcecream = 3.4;

	public IceCream(String type) throws Exception {
		this.type = type;
		
		if (type.equals("Fruit") || type.equals("fruit")) {
			priceIcecream = 3.56;
		} else if(type.equals("Chocolate") || type.equals("chocolate")) {
			priceIcecream = 4.52;
		} else if(type.equals("Cream") || type.equals("cream")){
			priceIcecream = 2.4;
		} else {
			throw new Exception();
		}
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPriceIcecream() {
		return priceIcecream;
	}

	public void setPriceIcecream(double priceIcecream) {
		this.priceIcecream = priceIcecream;
	}
	
	public void addAdditives(Additive a) {
		priceIcecream += a.getAdditivePrice();
	}
}
