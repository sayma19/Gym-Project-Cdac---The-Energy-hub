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
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class Batches {
	  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Batch_id;
	String Day;
	String Time;
	String Type;
	
	@OneToMany(mappedBy="batches",fetch=FetchType.EAGER)
	private Set<Branch> branch;

	
	@OneToOne
	//@JoinColumn(name="Trainer_name")
	private Trainer trainer;
	
	public Batches() {
		super();
	}

	public Batches(int batch_id, String day, String time, String type, Set<Branch> branch, Trainer trainer) {
		super();
		Batch_id = batch_id;
		Day = day;
		Time = time;
		Type = type;
		this.branch = branch;
		this.trainer = trainer;
	}

	public Batches(String day2, String time2) {
		this.Day=day2;
		this.Time=time2;
	}

	public int getBatch_id() {
		return Batch_id;
	}

	public void setBatch_id(int batch_id) {
		Batch_id = batch_id;
	}

	public String getDay() {
		return Day;
	}

	public void setDay(String day) {
		Day = day;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Set<Branch> getBranch() {
		return branch;
	}

	public void setBranch(Set<Branch> branch) {
		this.branch = branch;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Batches [Batch_id=" + Batch_id + ", Day=" + Day + ", Time=" + Time + ", Type=" + Type + ", branch="
				+ branch + ", trainer=" + trainer + "]";
	}

	
	
	
//	public Batches(int batch_id, String day, String time, String type, Set<Branch> branch, Trainer trainer) {
//		super();
//		Batch_id = batch_id;
//		Day = day;
//		Time = time;
//		Type = type;
//		this.branch = branch;
//		this.trainer = trainer;
//	}
//
//
//	public Batches(String day2, String time2) {
//		this.Day=day2;
//		this.Time=time2;
//	}
//
//	public Batches(String day2, String time2, String trainer2) {
//		this.Day=day2;
//		this.Time=time2;
//	
//	}
//
//	public int getBatch_id() {
//		return Batch_id;
//	}
//
//	public void setBatch_id(int batch_id) {
//		Batch_id = batch_id;
//	}
//
//	public String getDay() {
//		return Day;
//	}
//
//	public void setDay(String day) {
//		Day = day;
//	}
//
//	public String getTime() {
//		return Time;
//	}
//
//	public void setTime(String time) {
//		Time = time;
//	}
//
//	public String getType() {
//		return Type;
//	}
//
//	public void setType(String type) {
//		Type = type;
//	}
//
//	public Set<Branch> getBranch() {
//		return branch;
//	}
//
//	public void setBranch(Set<Branch> branch) {
//		this.branch = branch;
//	}
//
//	public Trainer getTrainer() {
//		return trainer;
//	}
//
//	public void setTrainer(Trainer trainer) {
//		this.trainer = trainer;
//	}
//
//	@Override
//	public String toString() {
//		return "Batches [Batch_id=" + Batch_id + ", Day=" + Day + ", Time=" + Time + ", Type=" + Type + ", branch="
//				+ branch + ", trainer=" + trainer + "]";
//	}
//
//	


	
	
	
	

//	
//
//	public Batches(int batch_id, String day, String time, String type, Branch branch) {
//		super();
//		Batch_id = batch_id;
//		Day = day;
//		Time = time;
//		Type = type;
//		this.branch = branch;
//	}
//
//
//
//
//	public int getBatch_id() {
//		return Batch_id;
//	}
//
//
//	public void setBatch_id(int batch_id) {
//		Batch_id = batch_id;
//	}
//
//
//	public String getDay() {
//		return Day;
//	}
//
//
//	public void setDay(String day) {
//		Day = day;
//	}
//
//
//	public String getTime() {
//		return Time;
//	}
//
//
//	public void setTime(String time) {
//		Time = time;
//	}
//
//
//	public String getType() {
//		return Type;
//	}
//
//
//	public void setType(String type) {
//		Type = type;
//	}
//
//
//	public Branch getBranch() {
//		return branch;
//	}
//
//
//	public void setBranch(Branch branch) {
//		this.branch = branch;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Batches [Batch_id=" + Batch_id + ", Day=" + Day + ", Time=" + Time + ", Type=" + Type + "]";
//	}
//	
//	
//	
//	

}
