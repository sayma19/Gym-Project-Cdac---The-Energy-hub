package training.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Login {
	@Id
	int id;
	String Role;
	String Username;
	String Password;
	
	
	
	public Login() {
		super();
	}



	public Login(int id, String role, String username, String password) {
		super();
		this.id = id;
		Role = role;
		Username = username;
		Password = password;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getRole() {
		return Role;
	}



	public void setRole(String role) {
		Role = role;
	}



	public String getUsername() {
		return Username;
	}



	public void setUsername(String username) {
		Username = username;
	}



	public String getPassword() {
		return Password;
	}



	public void setPassword(String password) {
		Password = password;
	}



	@Override
	public String toString() {
		return "Login [id=" + id + ", Role=" + Role + ", Username=" + Username + ", Password=" + Password + "]";
	}
	
	

}
