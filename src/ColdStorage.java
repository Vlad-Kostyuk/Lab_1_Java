
public class ColdStorage {
	
protected String  Manufacturer;
private int TotalVolume;
private static int Weight = 0;
protected int PowerConsumption;

 public ColdStorage(String Manufacturer, int TotalVolume, int Weight, int PowerConsumption){
	 this.Manufacturer = Manufacturer;
	 this.TotalVolume =  TotalVolume;
	 this.Weight =  Weight;
	 this.PowerConsumption = PowerConsumption;
 }

	public void getManufacturer() {
		
	}
	
    public void setManufacturer(String  Manufacturer) {
		this.Manufacturer = Manufacturer;
    }
    
//    
    public int getTotalVolume() {
    	return this.TotalVolume;
		
	}
	
    public void setTotalVolume(int TotalVolume) {
		this.TotalVolume =  TotalVolume;
	}
    
 //   
    public int getWeight() {
     return Weight;
	}
	
    public void setWeight(int Weight) {
		this.Weight =  Weight;
	}
 //   
    public int getPowerConsumption() {
    	return this.PowerConsumption;
	}
	
    public void setPowerConsumption(int PowerConsumption) {
		this.PowerConsumption = PowerConsumption;
		
	}
//
    static public void printStaticWeight() {
    	System.out.println(Weight);
    }
    
    public void printWeight() {
    	System.out.println(Weight);
    }
    
    public void resetValues(String Manufacturer, int TotalVolume, int Weight, int PowerConsumption){
   	 this.Manufacturer = Manufacturer;
   	 this.TotalVolume =  TotalVolume;
   	 this.Weight =  Weight;
   	 this.PowerConsumption = PowerConsumption;
    }
    
    public String toString() {
    	System.out.println(this.Manufacturer);
    	System.out.println(this.TotalVolume);
    	System.out.println(this.Weight);
    	System.out.println(this.PowerConsumption);
		return Manufacturer;
    }
    
}
