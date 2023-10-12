
public class Manufacturer {

	private String name;
	private int year_of_foundation;
	private int yearly_income;	
	
	public Manufacturer(String name, int year_of_foundation, int yearly_income) {
		this.name = name;
		this.year_of_foundation = year_of_foundation;
		this.yearly_income = yearly_income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear_of_foundation() {
		return year_of_foundation;
	}

	public void setYear_of_foundation(int year_of_foundation) {
		this.year_of_foundation = year_of_foundation;
	}

	public int getYearly_income() {
		return yearly_income;
	}

	public void setYearly_income(int yearly_income) {
		this.yearly_income = yearly_income;
	}
	
	
	
}
