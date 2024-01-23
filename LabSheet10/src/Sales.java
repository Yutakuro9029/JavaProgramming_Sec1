
public class Sales extends Employee{
	private double sales;
	
	public Sales(String id , String name, double salary, double sales) {
		super.
	}
	
	public Sales(String id , String name, double sales) {
		
		this.sales = sales;
	}
	
	static double commission=0;
	public double getCommission() {
		if(sales>=50000) {
			commission = (sales-50000)*(15*100);
		}
		else if (sales >=10000&&sales<50000) {
			commission = (sales-10000)*(10*100);
		}
		else {
			commission = 0;
		}
		return commission;
	}
	
	public String toString() {
		return super.getName()+"("+super.getId()+") get commission "+getCommission()+" B.";
	}

}
