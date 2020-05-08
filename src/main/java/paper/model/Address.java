package paper.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "address")
public class Address implements Serializable {

	@Id
	@Column(name = "add_id")
	private String add_id;
	@Column(name = "reg_id")
	private String reg_id;
	@Column(name = "house_no")
	private String house_no;
	@Column(name = "zipcode")
	private int pincode;
	public Address(String add_id, String reg_id, String house_no, int pincode) {
		super();
		this.add_id = add_id;
		this.reg_id = reg_id;
		this.house_no = house_no;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	public String getAdd_id() {
		return add_id;
	}
	public void setAdd_id(String add_id) {
		this.add_id = add_id;
	}
	public String getReg_id() {
		return reg_id;
	}
	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
}
