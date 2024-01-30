import java.time.Year;
public class FictionBook implements Author,Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String getFirstName() {
		return author_name.substring(0,author_name.indexOf(" ")).toUpperCase();
	}
	
	@Override
	public String getLastName() {
		return author_name.substring(author_name.indexOf(" ")+1).toUpperCase();
	}
	
	static boolean cheackEmail;
	@Override
	public boolean checkEmail() {
		if(email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com")) {
			cheackEmail = true;
		}
		else cheackEmail = false;
		return cheackEmail;
	}
	
	static int year = Year.now().getValue();
	@Override
	public int totalPublicYear() {
		return year-publicYear;
	}
	
	@Override
	public String getTitle() {
		return this.title;
	}
	
	static boolean formatName;
	public boolean checkFormatName() {
		if(author_name.indexOf(" ")!=-1) {
			formatName = true;
		}
		else formatName = false;
		return formatName;
	}
	
	public String toString() {
		return title+" write by "+getLastName().substring(0,1)+"."+getFirstName()+"("
				+ email+")\nPublished for "+totalPublicYear()+" years.";
	}

}
