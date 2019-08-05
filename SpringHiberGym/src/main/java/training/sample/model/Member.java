package training.sample.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Member")
public class Member {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int Member_id;
	@OneToOne
	@JoinColumn(name="Package_id")
	private Package1 pack;	
	
	String First_Name;
	String Last_name;
	String Gender;
	@Column(unique=true)
	String Mobile;
	@Column(unique=true)
	String Email;
	String Address;
	Date DOB ;
	String Occupation;
	String UserName;
	String Password;
	String Confirm_Pass;
	

	
	
	@ManyToOne(cascade=CascadeType.ALL) 
	   @JoinColumn(name="Trainer_id")
   private Trainer trainer;
	
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Member(int member_id, Package1 pack, String first_Name, String last_name, String gender, String mobile,
			String email, String address, Date dOB, String occupation, String userName, String password,
			String confirm_Pass, Trainer trainer) {
		super();
		Member_id = member_id;
		this.pack = pack;
		First_Name = first_Name;
		Last_name = last_name;
		Gender = gender;
		Mobile = mobile;
		Email = email;
		Address = address;
		DOB = dOB;
		Occupation = occupation;
		UserName = userName;
		Password = password;
		Confirm_Pass = confirm_Pass;
		this.trainer = trainer;
	}


	public Member(int member_id2) {

		this.Member_id=member_id2;
		
	}


	public Member(String uname, String lastname, String gender2, String mobile2, String email2, String address2,
			Date dob2, String occupation2, String user_name, String user_password, String confirm_password) {
		
		this.First_Name=uname;
		this.Last_name=lastname;
		this.Gender=gender2;
		this.Mobile=mobile2;
		this.Email=email2;
		this.Address=address2;
		this.DOB=dob2;
		this.Occupation=occupation2;
		this.UserName=user_name;
		this.Password=user_password;
		this.Confirm_Pass=confirm_password;
	}


	public Member(String userName2, String password2) {
		this.UserName=userName2;
		this.Password=password2;
	}


	public Member(String mobile2) {
		this.Mobile=mobile2;
	}


	public int getMember_id() {
		return Member_id;
	}


	public void setMember_id(int member_id) {
		Member_id = member_id;
	}


	public Package1 getPack() {
		return pack;
	}


	public void setPack(Package1 pack) {
		this.pack = pack;
	}


	public String getFirst_Name() {
		return First_Name;
	}


	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}


	public String getLast_name() {
		return Last_name;
	}


	public void setLast_name(String last_name) {
		Last_name = last_name;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getMobile() {
		return Mobile;
	}


	public void setMobile(String mobile) {
		Mobile = mobile;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public Date getDOB() {
		return DOB;
	}


	public void setDOB(Date dOB) {
		DOB = dOB;
	}


	public String getOccupation() {
		return Occupation;
	}


	public void setOccupation(String occupation) {
		Occupation = occupation;
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


	public String getConfirm_Pass() {
		return Confirm_Pass;
	}


	public void setConfirm_Pass(String confirm_Pass) {
		Confirm_Pass = confirm_Pass;
	}


	public Trainer getTrainer() {
		return trainer;
	}


	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}


	@Override
	public String toString() {
		return "Member [Member_id=" + Member_id + ", pack=" + pack + ", First_Name=" + First_Name + ", Last_name="
				+ Last_name + ", Gender=" + Gender + ", Mobile=" + Mobile + ", Email=" + Email + ", Address=" + Address
				+ ", DOB=" + DOB + ", Occupation=" + Occupation + ", UserName=" + UserName + ", Password=" + Password
				+ ", Confirm_Pass=" + Confirm_Pass + ", trainer=" + trainer + "]";
	}
	


//	public Member(int member_id, String first_Name, String last_name, String gender, String mobile, String email,
//			String address, Date dOB, String occupation, String userName, String password, String confirm_Pass,
//			Trainer trainer) {
//		super();
//		Member_id = member_id;
//		First_Name = first_Name;
//		Last_name = last_name;
//		Gender = gender;
//		Mobile = mobile;
//		Email = email;
//		Address = address;
//		DOB = dOB;
//		Occupation = occupation;
//		UserName = userName;
//		Password = password;
//		Confirm_Pass = confirm_Pass;
//		this.trainer = trainer;
//	}
//
//
//	public int getMember_id() {
//		return Member_id;
//	}
//
//
//	public void setMember_id(int member_id) {
//		Member_id = member_id;
//	}
//
//
//	public String getFirst_Name() {
//		return First_Name;
//	}
//
//
//	public void setFirst_Name(String first_Name) {
//		First_Name = first_Name;
//	}
//
//
//	public String getLast_name() {
//		return Last_name;
//	}
//
//
//	public void setLast_name(String last_name) {
//		Last_name = last_name;
//	}
//
//
//	public String getGender() {
//		return Gender;
//	}
//
//
//	public void setGender(String gender) {
//		Gender = gender;
//	}
//
//
//	public String getMobile() {
//		return Mobile;
//	}
//
//
//	public void setMobile(String mobile) {
//		Mobile = mobile;
//	}
//
//
//	public String getEmail() {
//		return Email;
//	}
//
//
//	public void setEmail(String email) {
//		Email = email;
//	}
//
//
//	public String getAddress() {
//		return Address;
//	}
//
//
//	public void setAddress(String address) {
//		Address = address;
//	}
//
//
//	public Date getDOB() {
//		return DOB;
//	}
//
//
//	public void setDOB(Date dOB) {
//		DOB = dOB;
//	}
//
//
//	public String getOccupation() {
//		return Occupation;
//	}
//
//
//	public void setOccupation(String occupation) {
//		Occupation = occupation;
//	}
//
//
//	public String getUserName() {
//		return UserName;
//	}
//
//
//	public void setUserName(String userName) {
//		UserName = userName;
//	}
//
//
//	public String getPassword() {
//		return Password;
//	}
//
//
//	public void setPassword(String password) {
//		Password = password;
//	}
//
//
//	public String getConfirm_Pass() {
//		return Confirm_Pass;
//	}
//
//
//	public void setConfirm_Pass(String confirm_Pass) {
//		Confirm_Pass = confirm_Pass;
//	}
//
//
//	public Trainer getTrainer() {
//		return trainer;
//	}
//
//
//	public void setTrainer(Trainer trainer) {
//		this.trainer = trainer;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Member [Member_id=" + Member_id + ", First_Name=" + First_Name + ", Last_name=" + Last_name
//				+ ", Gender=" + Gender + ", Mobile=" + Mobile + ", Email=" + Email + ", Address=" + Address + ", DOB="
//				+ DOB + ", Occupation=" + Occupation + ", UserName=" + UserName + ", Password=" + Password
//				+ ", Confirm_Pass=" + Confirm_Pass + ", trainer=" + trainer + "]";
//	}
//	
	
	
	
}
