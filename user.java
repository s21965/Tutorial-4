package tutorial4;

public class user {

	private String name;
	private String lastName;
	private String email;
	private String password;
	private String information;
	
	public user(String name, String lastName, String email, String password) {
		
		this.setName(name);	
		this.setLastName(lastName);
		this.setEmail(email);
		this.setPassword(password);
		
		information = " User Account ";
		
		}
	
	public user(String email) {
		
		this.setEmail(email);
		information = " Guest Account ";	
		
		}
	
	public void createUserFromGuest (String name, String lastName, String password) {
		
		if (information == " Guest Account ") {
			this.setName(name);
			this.setLastName(lastName);
			this.setPassword(password);
			information = " User Account";
		} else { 
			System.out.println("This account is already in use");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
	
}
