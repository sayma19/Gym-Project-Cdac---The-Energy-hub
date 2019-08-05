package training.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class LoginClass {
	@Id
	private String Email;
	private String Password;
	
	public LoginClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginClass(String email, String password) {
		super();
		Email = email;
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "LoginClass [Email=" + Email + ", Password=" + Password + "]";
	}
	
	
	
	
}
