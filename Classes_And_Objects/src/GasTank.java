
public class GasTank {
	
	private double amount =0.0;
	private double capacity;
	
	public GasTank(double cap) {
		capacity = cap;
	
	}
	
	public void addGas(double gas) {
		amount += gas;
		if (amount > capacity) {
			amount = capacity;
		}
	}
	
	public void useGas(double gas) {
		amount -= gas;
		if (amount < 0.0) {
			amount = 0.0;
		}
	}
	
	public boolean isEmpty() {
		if(amount < 0.1) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
		public boolean isFull() { 
			return amount > (capacity-0.1) ? true : false;
			}
	
	
	public double getGasLevel() {
		return amount;
	}
	
	public double fillUp() {
		amount += capacity;
		double difference = amount - capacity;
		return difference;
	}

}
