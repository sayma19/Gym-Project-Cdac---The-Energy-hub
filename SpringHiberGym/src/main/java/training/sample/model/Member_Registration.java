package training.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Member_Registration {
	
@Id
		int Member_id;
		String Member_name;
		String Mobile_no;
		String Email_id;
		String Address;
		String Password;
		
		
		public Member_Registration() {
			super();
		}


		public Member_Registration(int member_id, String member_name, String mobile_no, String email_id, String address,
				String password) {
			super();
			Member_id = member_id;
			Member_name = member_name;
			Mobile_no = mobile_no;
			Email_id = email_id;
			Address = address;
			Password = password;
		}


		public int getMember_id() {
			return Member_id;
		}


		public void setMember_id(int member_id) {
			Member_id = member_id;
		}


		public String getMember_name() {
			return Member_name;
		}


		public void setMember_name(String member_name) {
			Member_name = member_name;
		}


		public String getMobile_no() {
			return Mobile_no;
		}


		public void setMobile_no(String mobile_no) {
			Mobile_no = mobile_no;
		}


		public String getEmail_id() {
			return Email_id;
		}


		public void setEmail_id(String email_id) {
			Email_id = email_id;
		}


		public String getAddress() {
			return Address;
		}


		public void setAddress(String address) {
			Address = address;
		}


		public String getPassword() {
			return Password;
		}


		public void setPassword(String password) {
			Password = password;
		}


		@Override
		public String toString() {
			return "Member_Registration [Member_id=" + Member_id + ", Member_name=" + Member_name + ", Mobile_no="
					+ Mobile_no + ", Email_id=" + Email_id + ", Address=" + Address + ", Password=" + Password + "]";
		}



	}


