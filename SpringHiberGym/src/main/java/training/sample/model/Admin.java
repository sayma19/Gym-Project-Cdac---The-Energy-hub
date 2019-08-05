package training.sample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin {


	@Id
	@GeneratedValue
	int Admin_id;
	String Admin_name;
	String DOB ;
	String Gender;
	String Email_id;
	String Mobile_no;
	String UserName;
	String Password;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Admin(int admin_id, String admin_name, String dOB, String gender, String email_id, String mobile_no,
			String userName, String password) {
		super();
		Admin_id = admin_id;
		Admin_name = admin_name;
		DOB = dOB;
		Gender = gender;
		Email_id = email_id;
		Mobile_no = mobile_no;
		UserName = userName;
		Password = password;
	}


	public Admin(String userName2, String password2) {
		// TODO Auto-generated constructor stub
		this.UserName=userName2;
		this.Password=password2;
	}


	public int getAdmin_id() {
		return Admin_id;
	}


	public void setAdmin_id(int admin_id) {
		Admin_id = admin_id;
	}


	public String getAdmin_name() {
		return Admin_name;
	}


	public void setAdmin_name(String admin_name) {
		Admin_name = admin_name;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getEmail_id() {
		return Email_id;
	}


	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}


	public String getMobile_no() {
		return Mobile_no;
	}


	public void setMobile_no(String mobile_no) {
		Mobile_no = mobile_no;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	@Override
	public String toString() {
		return "Admin [Admin_id=" + Admin_id + ", Admin_name=" + Admin_name + ", DOB=" + DOB + ", Gender=" + Gender
				+ ", Email_id=" + Email_id + ", Mobile_no=" + Mobile_no + ", UserName=" + UserName + ", Password="
				+ Password + "]";
	}
	
	
	
	
}
