package paper.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "viewer")
public class User implements Serializable {

	@Id
	@Column(name = "v_id")
	private String u_id;
	@Column(name = "v_name")
	private String u_name;	
	@Column(name = "v_email")
	private String u_email;
	@Column(name = "v_dob")
	private Date u_age;
	@Column(name = "acc_id")
	private String acc_id;
	@Column(name = "reg_id")
	private String reg_id;

	

	public User(String u_id, String u_name, String u_email, Date u_age, String acc_id, String reg_id) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_email = u_email;
		this.u_age = u_age;
		this.acc_id = acc_id;
		this.reg_id = reg_id;
	}

	public User() {
		super();
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public Date getU_age() {
		return u_age;
	}

	public void setU_age(Date u_age) {
		this.u_age = u_age;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public String getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(String acc_id) {
		this.acc_id = acc_id;
	}

	public String getReg_id() {
		return reg_id;
	}

	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}

}
