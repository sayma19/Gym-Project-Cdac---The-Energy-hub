package training.sample.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Branch {
	//  @OneToMany(mappedBy = "Branch", fetch = FetchType.EAGER)
	    @Id  
	    @GeneratedValue(strategy=GenerationType.AUTO)  

	int Branch_id;
	String Branch_name;
	String Address;
	
	
	
	@ManyToOne(cascade=CascadeType.ALL) 
	   @JoinColumn(name="Batches_id")
      private Batches batches;
	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Branch(int branch_id, String branch_name, String address, Batches batches) {
		super();
		Branch_id = branch_id;
		Branch_name = branch_name;
		Address = address;
		this.batches = batches;
	}
	public int getBranch_id() {
		return Branch_id;
	}
	public void setBranch_id(int branch_id) {
		Branch_id = branch_id;
	}
	public String getBranch_name() {
		return Branch_name;
	}
	public void setBranch_name(String branch_name) {
		Branch_name = branch_name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Batches getBatches() {
		return batches;
	}
	public void setBatches(Batches batches) {
		this.batches = batches;
	}
	@Override
	public String toString() {
		return "Branch [Branch_id=" + Branch_id + ", Branch_name=" + Branch_name + ", Address=" + Address + ", batches="
				+ batches + "]";
	}

	
	
	
	
	
//	
//	public Branch() {
//		super();
//	}
//
//
//	public Branch(int branch_id, String branch_name, String address) {
//		super();
//		Branch_id = branch_id;
//		Branch_name = branch_name;
//		Address = address;
//	}
//
//
//	public int getBranch_id() {
//		return Branch_id;
//	}
//
//
//	public void setBranch_id(int branch_id) {
//		Branch_id = branch_id;
//	}
//
//
//	public String getBranch_name() {
//		return Branch_name;
//	}
//
//
//	public void setBranch_name(String branch_name) {
//		Branch_name = branch_name;
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
//	@Override
//	public String toString() {
//		return "Branch [Branch_id=" + Branch_id + ", Branch_name=" + Branch_name + ", Address=" + Address + "]";
//	}
	
	
	
	
}
