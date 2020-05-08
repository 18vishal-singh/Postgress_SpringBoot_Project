package paper.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "region")
public class Region implements Serializable {

	@Id
	@Column(name = "reg_id")
	private String reg_id;
	@Column(name = "city")
	private String city;
	@Column(name = "state_name")
	private String state;
	@Column(name = "country")
	private String country;
	public Region(String reg_id, String city, String state, String country) {
		super();
		this.reg_id = reg_id;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public Region() {
		super();
	}
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
