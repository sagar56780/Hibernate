package school;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentId {
	@Id
	private int registrationNo;
	private int standrad;
	private char section;
	private String father_name;
	
	public StudentId(int registrationNo, int standrad, char section, String father_name) {
		super();
		this.registrationNo = registrationNo;
		this.standrad = standrad;
		this.section = section;
		this.father_name = father_name;
	}
	public StudentId()
	{
		
	}
	public int getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(int registrationNo) {
		this.registrationNo = registrationNo;
	}
	public int getStandrad() {
		return standrad;
	}
	public void setStandrad(int standrad) {
		this.standrad = standrad;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	@Override
	public String toString() {
		return "StudentId [registrationNo=" + registrationNo + ", standrad=" + standrad + ", section=" + section
				+ ", father_name=" + father_name + "]";
	}
	
	
	
	

}
