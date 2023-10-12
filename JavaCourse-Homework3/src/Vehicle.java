
public abstract class Vehicle {

	private String model;
	private Manufacturer manufacturer;
	private Engine engine;
	private int year_of_manufacture;
	private String color;
	private int price;
	
	abstract void ShowCharacteristics();

	public Vehicle(String model, Manufacturer manufacturer, Engine engine, int year_of_manufacture, String color, int price) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.engine = engine;
		this.year_of_manufacture = year_of_manufacture;
		this.color = color;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getYear_of_manufacture() {
		return year_of_manufacture;
	}

	public void setYear_of_manufacture(int year_of_manufacture) {
		this.year_of_manufacture = year_of_manufacture;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
}
