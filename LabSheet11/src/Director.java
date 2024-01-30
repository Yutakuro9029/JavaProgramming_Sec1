
public class Director {
	private String name;
	private String email;
	private char gender;
	
	Director(String name , String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	Director(String name , String email){
		this.name = name;
		this.email = email;
		this.gender = ' ';
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	static String genderName;
	public String getGenderName() {
		if(gender=='M'||gender =='m') {
			genderName = "Male";
		}
		else if(gender=='F'||gender =='f') {
			genderName = "Female";
		}
		else {
			genderName = null;
		}
		return genderName;
	}
	
	public String toString() {
		return name+"("+email+";"+getGenderName()+")";
	}

}
