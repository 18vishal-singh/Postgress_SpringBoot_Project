package paper.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "vid_owner")
public class Owner implements Serializable{

	@Id
	@Column(name = "owner_id")
	private String o_id;
	@Column(name = "owner_name")
	private String o_name;
	@Column(name = "add_id")
	private String add_id;
	@Column(name = "owner_email")
	private String o_email;
	@Column(name = "acc_id")
	private String acc_id;
	public Owner(String o_id, String o_name, String add_id, String o_email, String acc_id) {
		super();
		this.o_id = o_id;
		this.o_name = o_name;
		this.add_id = add_id;
		this.o_email = o_email;
		this.acc_id = acc_id;
	}
	public Owner() {
		super();
	}
	public String getO_id() {
		return o_id;
	}
	public void setO_id(String o_id) {
		this.o_id = o_id;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public String getAdd_id() {
		return add_id;
	}
	public void setAdd_id(String add_id) {
		this.add_id = add_id;
	}
	public String getO_email() {
		return o_email;
	}
	public void setO_email(String o_email) {
		this.o_email = o_email;
	}
	public String getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(String acc_id) {
		this.acc_id = acc_id;
	}
	
	
	
	
}
