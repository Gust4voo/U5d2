package gustavooliveira.u5d1;

public class topping {
	private String name;
	private double price;
	private int nutritionInfo;

	public topping(String name, double price, int nutritionInfo) {
		this.name = name;
		this.price = price;
		this.nutritionInfo = nutritionInfo;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int nutritionInfo() {
		return nutritionInfo;
	}

}