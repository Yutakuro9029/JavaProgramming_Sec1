
public class Product {
	private int unit;
	
	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	public int getUnit() {
		return this.unit;
	}
	
	public int getTotalprice() {
		return 100*this.unit;
	}
	
	public String toString() {
		return "You buy "+this.unit+" units ("+getTotalprice()+").";
	}

}
