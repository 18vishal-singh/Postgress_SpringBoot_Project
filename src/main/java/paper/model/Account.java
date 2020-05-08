package paper.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "account")
public class Account implements Serializable {

	@Id
	@Column(name = "acc_id")
	private String acc_id;
	@Column(name = "create_date")
	private Date date;
	@Column(name = "user_name")
	private String login_name;
	@Column(name = "user_password")
	private String login_pass;
	public Account(String acc_id, Date date, String login_name, String login_pass) {
		super();
		this.acc_id = acc_id;
		this.date = date;
		this.login_name = login_name;
		this.login_pass = login_pass;
	}
	public Account() {
		super();
	}
	public String getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(String acc_id) {
		this.acc_id = acc_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getLogin_pass() {
		return login_pass;
	}
	public void setLogin_pass(String login_pass) {
		this.login_pass = login_pass;
	}
	
	
	
	

}
