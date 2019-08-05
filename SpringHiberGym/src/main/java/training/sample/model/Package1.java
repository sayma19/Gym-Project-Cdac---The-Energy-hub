package training.sample.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Package1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Package_id;
	String Package_name;
	String Duration;
	String Amount;
	
    @OneToOne(mappedBy="pack",fetch=FetchType.EAGER)
	@JoinColumn(name="Member_id")	
          private Member member ;
	
	
	public Package1() {
		super();
	}

	public Package1(int package_id4) {

		this.Package_id=package_id4;
		
	}


	public Package1(int package_id, String package_name, String duration, String amount, Member member) {
		super();
		Package_id = package_id;
		Package_name = package_name;
		Duration = duration;
		Amount = amount;
		this.member = member;
	}

	public Package1(String package_name2, String duration2, String amount2) {
	
		this.Package_name = package_name2;
		this.Duration = duration2;
		this.Amount = amount2;
	
	}


	public int getPackage_id() {
		return Package_id;
	}


	public void setPackage_id(int package_id) {
		Package_id = package_id;
	}


	public String getPackage_name() {
		return Package_name;
	}


	public void setPackage_name(String package_name) {
		Package_name = package_name;
	}


	public String getDuration() {
		return Duration;
	}


	public void setDuration(String duration) {
		Duration = duration;
	}


	public String getAmount() {
		return Amount;
	}


	public void setAmount(String amount) {
		Amount = amount;
	}


	public Member getMember() {
		return member;
	}


	public void setMember(Member member) {
		this.member = member;
	}


	@Override
	public String toString() {
		return "Package [Package_id=" + Package_id + ", Package_name=" + Package_name + ", Duration=" + Duration
				+ ", Amount=" + Amount + ", member=" + member + "]";
	}
	


//	public Package(int package_id, String package_name, String duration, String amount) {
//		super();
//		Package_id = package_id;
//		Package_name = package_name;
//		Duration = duration;
//		Amount = amount;
//	}
//
//
//	public int getPackage_id() {
//		return Package_id;
//	}
//
//
//	public void setPackage_id(int package_id) {
//		Package_id = package_id;
//	}
//
//
//	public String getPackage_name() {
//		return Package_name;
//	}
//
//
//	public void setPackage_name(String package_name) {
//		Package_name = package_name;
//	}
//
//
//	public String getDuration() {
//		return Duration;
//	}
//
//
//	public void setDuration(String duration) {
//		Duration = duration;
//	}
//
//
//	public String getAmount() {
//		return Amount;
//	}
//
//
//	public void setAmount(String amount) {
//		Amount = amount;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Package [Package_id=" + Package_id + ", Package_name=" + Package_name + ", Duration=" + Duration
//				+ ", Amount=" + Amount + "]";
//	}
//	
//	
}
