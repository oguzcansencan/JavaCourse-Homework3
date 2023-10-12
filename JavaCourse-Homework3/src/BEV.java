
public class BEV extends Vehicle {

	public BEV(String model, Manufacturer manufacturer, Engine engine, int year_of_manufacture, String color,
			int price) {
		super(model, manufacturer, engine, year_of_manufacture, color, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void ShowCharacteristics() {
		System.out.println(
				this.getManufacturer().getName()
				+ ", " + this.getModel()
				+ ", " + this.getEngine().getClass().getName()
				+ ", " + this.getYear_of_manufacture()
				+ ", " + this.getColor()
				+ ", " + this.getPrice());
	}

}
