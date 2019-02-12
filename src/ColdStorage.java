
public class ColdStorage {

	private String manufacturer;
	private int totalvolume;
	private int weight;
	private int powerconsumption;

	private String color;
	private int freezingpower;
	private static int height = 3;
	protected int noiselevel;
	protected int guarantee;

	public ColdStorage() {

	}

	public ColdStorage(String manufacturer, int totalvolume, int weight, int powerconsumption) {
		this.manufacturer = manufacturer;
		this.totalvolume = totalvolume;
		this.weight = weight;
		this.powerconsumption = powerconsumption;
	}

	public ColdStorage(String manufacturer, int totalvolume, int weight, int powerconsumption, String color,
			int freezingpower, int noiselevel, int guarantee) {
		this(manufacturer, totalvolume, weight, powerconsumption);
		this.color = color;
		this.freezingpower = freezingpower;
		this.noiselevel = noiselevel;
		this.guarantee = guarantee;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getTotalVolume() {
		return totalvolume;
	}

	public void setTotalVolume(int totalvolume) {
		this.totalvolume = totalvolume;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPowerConsumption() {
		return powerconsumption;
	}

	public void setPowerConsumption(int powerconsumption) {
		this.powerconsumption = powerconsumption;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getFreezingpower() {
		return freezingpower;
	}

	public void setFreezingpower(int freezingpower) {
		this.freezingpower = freezingpower;
	}

	public static int getHeight() {
		return height;
	}

	public static void setHeight(int height) {
		ColdStorage.height = height;
	}

	public int getNoiselevel() {
		return noiselevel;
	}

	public void setNoiselevel(int noiselevel) {
		this.noiselevel = noiselevel;
	}

	public int getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(int guarantee) {
		this.guarantee = guarantee;
	}

	static public void printStaticHeight() {
		System.out.println(height);
	}

	public void printHeight() {
		System.out.println(height);
	}

	public void resetValues(String manufacturer, int totalvolume, int weight, int powerconsumption, String color,
			int freezingpower, int noiselevel, int guarantee) {
		this.manufacturer = manufacturer;
		this.totalvolume = totalvolume;
		this.weight = weight;
		this.powerconsumption = powerconsumption;
		this.color = color;
		this.freezingpower = freezingpower;
		this.noiselevel = noiselevel;
		this.guarantee = guarantee;
	}

	@Override
	public String toString() {
		return "manufacturer = " + manufacturer + ", totalvolume = " + totalvolume + ", weight = " + weight
				+ ", powerconsumption = " + powerconsumption + ", color = " + color + ", freezingpower = "
				+ freezingpower + ", noiselevel = " + noiselevel + ", guarantee = " + guarantee;
	}

	public void PrintInfo() {
		System.out.println(this.toString());
	}

}
