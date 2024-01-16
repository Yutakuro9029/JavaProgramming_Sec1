
public class Author {
	private String name,email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public Author() {
		this.name = "";
		this.email = "";
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
		if(gender=='M') {
			return genderName = "Male";
		}
		else if(gender=='F') {
			return genderName = "Female";
		}
		else if(gender!='M'&&gender!='F') {
			return genderName = null;
		}
		return genderName;
	}
	
	public String toString() {
		return "Author name : "+getName()+" ("+getEmail()+";"+getGenderName()+")";
	}

}
