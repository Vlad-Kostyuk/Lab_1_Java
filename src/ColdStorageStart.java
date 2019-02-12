
public class ColdStorageStart {
	public static void main(String[] args) {
		ColdStorage.printStaticHeight();
		ColdStorage storageLG = new ColdStorage("LG", 125, 5000, 10, "white", 20, 45, 12);

		storageLG.setManufacturer("LG Old");
		storageLG.getManufacturer();
		storageLG.setTotalVolume(35);
		storageLG.getTotalVolume();
		storageLG.setWeight(345);
		storageLG.getWeight();
		storageLG.setPowerConsumption(125);
		storageLG.getPowerConsumption();

		storageLG.getColor();
		storageLG.setColor("yellow");
		storageLG.getFreezingpower();
		storageLG.setFreezingpower(12);
		storageLG.getNoiselevel();
		storageLG.setNoiselevel(67);
		storageLG.getGuarantee();
		storageLG.setGuarantee(12);

		storageLG.printHeight();

		storageLG.resetValues("LG New", 250, 10000, 20, "black", 15, 49, 24);
		storageLG.toString();
		storageLG.PrintInfo();

		ColdStorage storagepPhilips = new ColdStorage("Philips", 225, 50000, 100, "green", 17, 50, 12);
		storagepPhilips.PrintInfo();
		ColdStorage storageSamsung = new ColdStorage("Samsung", 325, 500000, 300, "gray", 25, 60, 24);
		storageSamsung.PrintInfo();
	}
}
