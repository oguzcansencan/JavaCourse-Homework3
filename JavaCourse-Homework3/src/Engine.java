
public class Engine {

	private String name;
	private int year_of_manufacture;
	private int horse_power;
	private int price;
	
	public Engine(String name, int year_of_manufacture, int horse_power, int price) {
		this.name = name;
		this.year_of_manufacture = year_of_manufacture;
		this.horse_power = horse_power;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear_of_manufacture() {
		return year_of_manufacture;
	}

	public void setYear_of_manufacture(int year_of_manufacture) {
		this.year_of_manufacture = year_of_manufacture;
	}

	public int getHorse_power() {
		return horse_power;
	}

	public void setHorse_power(int horse_power) {
		this.horse_power = horse_power;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}	
	
	
	
}
