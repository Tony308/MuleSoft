package email;

public class Credentials {

	Credentials(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	Credentials() {	
	}
	
	private String username;
	
	private String password;
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
