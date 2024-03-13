package model.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Admin  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private String login_name;
	private String name;
	private String password;
	@OneToMany
	private List<Course> courses;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", login_name=" + login_name + ", name=" + name + ", password=" + password;
	}
	public Admin(int aid, String login_name, String name, String password, List<Course> courses) {
		super();
		this.aid = aid;
		this.login_name = login_name;
		this.name = name;
		this.password = password;
		this.courses = courses;
	}
	public Admin() {
		super();
	}
   
	

}
