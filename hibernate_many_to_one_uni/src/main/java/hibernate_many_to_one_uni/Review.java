package hibernate_many_to_one_uni;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	private int id;
	private double rating;
	private String discription;
	@ManyToOne
	private Product p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public Review() {
		super();
	}
	public Review(int id, double rating, String discription, Product p) {
		super();
		this.id = id;
		this.rating = rating;
		this.discription = discription;
		this.p = p;
	}
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", rating=" + rating + ", discription=" + discription + ", p=" + p + "]";
	}
	

}
