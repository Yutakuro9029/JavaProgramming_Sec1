import java.text.*;
public class Example2 
{

	public static void main(String[] args) 
	{
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final double BUFFET =299;
		int customer = 5;
		double netPrice = BUFFET*customer;
		System.out.println("Buffet of "+ customer
				+" customers is "+ frm.format(netPrice));
		double serviceCharge = netPrice*103/100;
		System.out.println("Add Service Charge 3% is "
				+ frm.format(serviceCharge));

	}

}
