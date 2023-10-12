
public class Test {

	public static void main(String[] args) {
		
		Manufacturer[] arr_man = {
				new Manufacturer("Suzuki", 1909, 500000),
				new Manufacturer("Mitsubishi", 1970, 800000),
				new Manufacturer("Porsche", 1931, 550000),
				new Manufacturer("Volkswagen", 1937, 250000),
				new Manufacturer("Lada", 1973, 120000)};
		
		Engine[] arr_eng = {
				new CombustionEngine("ASD3000", 2010, 270, 12000),
				new CombustionEngine("XYZ78200", 1978, 200, 8000),
				new CombustionEngine("OZVT31", 2010, 500, 25000),
				new ElectricEngine("3-Phase AC", 2014, 600, 25000),
				new HybridEngine("KF-1500V2", 2012, 300, 17500)};	
	
		Vehicle[] arr_veh = {
				new BEV("Sedan", arr_man[1], arr_eng[3], 1980, "Purple", 16599),
				new HybridV("SUV", arr_man[3], arr_eng[4], 2018, "Black", 44999),
				new ICEV("Hatchback", arr_man[2], arr_eng[2], 2020, "Gray", 85000),
				new ICEV("Sedan", arr_man[4], arr_eng[2], 2020, "Green", 36999)
				};
		
		for (Vehicle v : arr_veh) {
			v.ShowCharacteristics();
		}
		
	}
	
}
