package model.dto;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Student  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	String name;
	String college;
	String father_name;
	private double fee_details;
	@ManyToOne
	private Course course;
	public Student(String name, String college, String father_name, double fee_details,
			Course course) {
		super();
		this.name=name;
		this.college = college;
		this.father_name = father_name;
		this.fee_details = fee_details;
		this.course = course;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	
	public double getFee_details() {
		return fee_details;
	}
	public void setFee_details(double fee_details) {
		this.fee_details = fee_details;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	

}
