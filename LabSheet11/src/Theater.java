
public class Theater extends Movie {
	private int theaterNo;
	
	Theater(String id , String name , Director director, int theaterNo){
		super(id,name,director);
		this.theaterNo = theaterNo;
	}
	
	Theater(){
		super();
		this.theaterNo = 0;
	}
	
	static String theaterName;
	public String getTheaterName() {
		if(theaterNo>=1&&theaterNo<=11) {
			theaterName = "Basic Theater";
		}
		else if(theaterNo>=12&&theaterNo<=14) {
			theaterName = "Sweet Theater";
		}
		else if(theaterNo==15) {
			theaterName = "Premium Theater";
		}
		else {
			theaterName = null;
		}
		return theaterName;
	}
	
	public String toString() {
		return getTheaterName()+": "+super.toString();
	}
}
