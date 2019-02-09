
public class ColdStorageStart {
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		 ColdStorage.printStaticWeight();
		 ColdStorage storageLG = new  ColdStorage("LG", 125, 5000, 10);
	
		 storageLG.setManufacturer("LG New");
		 storageLG.getManufacturer();
		 
		 storageLG.setPowerConsumption(125);
		 storageLG.getPowerConsumption();
		 
		 storageLG.setTotalVolume(35);
		 storageLG.getTotalVolume();
		  
		 storageLG.setWeight(345);
		 storageLG.getWeight();
		 
		 storageLG.printWeight();
		 
		 storageLG.resetValues("LG", 250, 10000, 20);
		 storageLG.toString();
		 
		 ColdStorage storagepPhilips = new  ColdStorage("Philips", 225, 50000, 100);
		 storagepPhilips.toString();
		 ColdStorage storageSamsung = new  ColdStorage("Samsung", 325, 500000, 300);
		 storageSamsung.toString();
		}
}
